package comminity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("comminity.Student");
        Object obj = c.newInstance();
        Method method = c.getDeclaredMethod("print", null);
        method.setAccessible(true);
        method.invoke(obj, null);
    }

}
