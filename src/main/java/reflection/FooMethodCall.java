package reflection;

import java.lang.reflect.Method;

public class FooMethodCall {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Foo");
        Object o = c.newInstance();
        Method m = c.getDeclaredMethod("message", null);
        m.setAccessible(true);
        m.invoke(o, null);
    }
}
