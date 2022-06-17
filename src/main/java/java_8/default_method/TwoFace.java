package java_8.default_method;

public class TwoFace implements Foo1, Foo2 {

    public static void main(String[] args) {
        new TwoFace().foo();
    }

    @Override
    public void foo() {
        Foo2.super.foo();
    }
}
