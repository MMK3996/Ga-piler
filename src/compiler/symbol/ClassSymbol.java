package compiler.symbol;

import java.util.HashMap;
import java.util.Map;

public class ClassSymbol {
    private final String name;
    private String parentName;
    private ClassSymbol parent;
    private final Map<String, Symbol> fields = new HashMap<>();
    private final Map<String, MethodSymbol> methods = new HashMap<>();
    private boolean isMainClass = false;

    public ClassSymbol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public ClassSymbol getParent() {
        return parent;
    }

    public void setParent(ClassSymbol parent) {
        this.parent = parent;
    }

    public boolean isMainClass() {
        return isMainClass;
    }

    public void setMainClass(boolean mainClass) {
        isMainClass = mainClass;
    }

    public boolean addField(Symbol field) {
        if (fields.containsKey(field.getName())) {
            return false;
        }
        fields.put(field.getName(), field);
        return true;
    }

    public Symbol getField(String fieldName) {
        if (fields.containsKey(fieldName)) {
            return fields.get(fieldName);
        }
        if (parent != null) {
            return parent.getField(fieldName);
        }
        return null;
    }

    public Map<String, Symbol> getDirectFields() {
        return fields;
    }

    public boolean addMethod(MethodSymbol method) {
        if (methods.containsKey(method.getName())) {
            return false;
        }
        methods.put(method.getName(), method);
        return true;
    }

    public MethodSymbol getMethod(String methodName) {
        if (methods.containsKey(methodName)) {
            return methods.get(methodName);
        }
        if (parent != null) {
            return parent.getMethod(methodName);
        }
        return null;
    }

    public Map<String, MethodSymbol> getDirectMethods() {
        return methods;
    }

    public boolean isSubclassOf(ClassSymbol target) {
        if (target == null) return false;
        if (this.equals(target)) return true;
        if (parent != null) {
            return parent.isSubclassOf(target);
        }
        return false;
    }
}
