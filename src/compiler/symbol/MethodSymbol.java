package compiler.symbol;

import java.util.ArrayList;
import java.util.List;

public class MethodSymbol {
    private final String name;
    private final Type returnType;
    private final boolean isStatic;
    private final List<Symbol> parameters = new ArrayList<>();

    public MethodSymbol(String name, Type returnType, boolean isStatic) {
        this.name = name;
        this.returnType = returnType;
        this.isStatic = isStatic;
    }

    public String getName() {
        return name;
    }

    public Type getReturnType() {
        return returnType;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public List<Symbol> getParameters() {
        return parameters;
    }

    public void addParameter(Symbol param) {
        parameters.add(param);
    }
}
