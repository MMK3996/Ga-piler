package compiler.error;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class AUJavaErrorListener extends BaseErrorListener {
    public static final AUJavaErrorListener INSTANCE = new AUJavaErrorListener();
    private final List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String errorMsg = String.format("Syntax/Lexical Error [Line %d:%d] %s", line, charPositionInLine, msg);
        errors.add(errorMsg);
    }

    public void addSemanticError(int line, int charPositionInLine, String msg) {
        String errorMsg = String.format("Semantic Error [Line %d:%d] %s", line, charPositionInLine, msg);
        errors.add(errorMsg);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<String> getErrors() {
        return errors;
    }

    public void printErrors() {
        for (String err : errors) {
            System.err.println(err);
        }
    }

    public void clear() {
        errors.clear();
    }
}
