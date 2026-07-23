package compiler.symbol;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private final Map<String, ClassSymbol> classes = new HashMap<>();
    private ClassSymbol currentClass;
    private MethodSymbol currentMethod;
    private Scope currentScope;
    private int loopNestingCount = 0;

    public boolean addClass(ClassSymbol classSymbol) {
        if (classes.containsKey(classSymbol.getName())) {
            return false;
        }
        classes.put(classSymbol.getName(), classSymbol);
        return true;
    }

    public ClassSymbol getClass(String className) {
        return classes.get(className);
    }

    public Map<String, ClassSymbol> getClasses() {
        return classes;
    }

    public ClassSymbol getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(ClassSymbol currentClass) {
        this.currentClass = currentClass;
    }

    public MethodSymbol getCurrentMethod() {
        return currentMethod;
    }

    public void setCurrentMethod(MethodSymbol currentMethod) {
        this.currentMethod = currentMethod;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void enterScope() {
        currentScope = new Scope(currentScope);
    }

    public void exitScope() {
        if (currentScope != null) {
            currentScope = currentScope.getParent();
        }
    }

    public boolean declareVariable(Symbol sym) {
        if (currentScope != null) {
            return currentScope.declare(sym);
        }
        return false;
    }

    public Symbol resolveVariable(String name) {
        if (currentScope != null) {
            Symbol sym = currentScope.resolve(name);
            if (sym != null) return sym;
        }
        if (currentClass != null) {
            return currentClass.getField(name);
        }
        return null;
    }

    public void enterLoop() {
        loopNestingCount++;
    }

    public void exitLoop() {
        if (loopNestingCount > 0) {
            loopNestingCount--;
        }
    }

    public boolean isInLoop() {
        return loopNestingCount > 0;
    }
}
