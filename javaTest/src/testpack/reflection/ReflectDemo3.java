package testpack.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c = Class.forName("testpack.reflection.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj, "Alice");
        System.out.println(obj);
    }
}
