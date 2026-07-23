package compiler.symbol;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private final Scope parent;
    private final Map<String, Symbol> variables = new HashMap<>();

    public Scope(Scope parent) {
        this.parent = parent;
    }

    public Scope getParent() {
        return parent;
    }

    public boolean declare(Symbol sym) {
        if (variables.containsKey(sym.getName())) {
            return false; // Redeclaration in current scope
        }
        variables.put(sym.getName(), sym);
        return true;
    }

    public Symbol resolve(String name) {
        if (variables.containsKey(name)) {
            return variables.get(name);
        }
        if (parent != null) {
            return parent.resolve(name);
        }
        return null;
    }
}
