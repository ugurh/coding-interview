package design_pattern.adapter;

public class CryptA implements Crypt {

    @Override
    public void encrypt() {
        System.out.println("#CryptA#encrypt()");
    }

    @Override
    public void decrypt() {
        System.out.println("#CryptA#decrypt()");
    }
}
