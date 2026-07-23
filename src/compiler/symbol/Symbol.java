package compiler.symbol;

public class Symbol {
    private final String name;
    private final Type type;
    private final boolean isStatic;
    private final boolean isField;

    public Symbol(String name, Type type, boolean isStatic, boolean isField) {
        this.name = name;
        this.type = type;
        this.isStatic = isStatic;
        this.isField = isField;
    }

    public Symbol(String name, Type type) {
        this(name, type, false, false);
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public boolean isField() {
        return isField;
    }
}
