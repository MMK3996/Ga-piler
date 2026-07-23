package compiler.symbol;

import java.util.Objects;

public class Type {
    public enum Kind {
        INT, BOOLEAN, VOID, CLASS, ERROR, NULL
    }

    public static final Type INT_TYPE = new Type(Kind.INT, "int");
    public static final Type BOOL_TYPE = new Type(Kind.BOOLEAN, "boolean");
    public static final Type VOID_TYPE = new Type(Kind.VOID, "void");
    public static final Type ERROR_TYPE = new Type(Kind.ERROR, "error");
    public static final Type NULL_TYPE = new Type(Kind.NULL, "null");

    private final Kind kind;
    private final String name;

    public Type(Kind kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    public Kind getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public boolean isPrimitive() {
        return kind == Kind.INT || kind == Kind.BOOLEAN;
    }

    public boolean isClass() {
        return kind == Kind.CLASS;
    }

    public boolean isError() {
        return kind == Kind.ERROR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        if (kind == Kind.ERROR || type.kind == Kind.ERROR) return true; // prevent error cascading
        if (kind == Kind.NULL && type.isClass()) return true;
        if (type.kind == Kind.NULL && this.isClass()) return true;
        return kind == type.kind && Objects.equals(name, type.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, name);
    }

    @Override
    public String toString() {
        return name;
    }
}
