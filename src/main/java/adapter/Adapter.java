package adapter;

/**
 * The Adapter pattern is similar in that it sits between two incompatible classes that
 * otherwise can't work with eachother and lets them work together.
 */
public class Adapter implements Crypt {

    CodeX codex;

    public Adapter(CodeX codex) {
        this.codex = codex;
    }

    @Override
    public void encrypt() {
        codex.textToCode();
    }

    @Override
    public void decrypt() {
        codex.codeToText();
    }
}
