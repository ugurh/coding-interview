package design_pattern.adapter;

public class Client {

    public static void main(String[] args) {

        Crypt cryptA = new CryptA();
        cryptA.encrypt();
        cryptA.decrypt();

        CodeX codeX = new CodeX();
        Adapter adapter = new Adapter(codeX);
        adapter.encrypt();
        adapter.decrypt();
    }
}
