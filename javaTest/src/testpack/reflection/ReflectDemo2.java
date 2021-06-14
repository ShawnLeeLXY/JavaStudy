package testpack.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
//反射获取构造方法并使用
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("testpack.reflection.Student");
        //通过获取公共构造方法反射，实现Student stu = new Student("Alice", 18, "London");
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        Object obj = con.newInstance("Alice", 18, "London");
        System.out.println(obj);
        //通过获取私有构造方法暴力反射，实现Student stu = new Student("Alice)
        Constructor<?> con2 = c.getDeclaredConstructor(String.class);
        con2.setAccessible(true); //值为ture，取消访问检查
        Object obj2 = con2.newInstance("Alice");
        System.out.println(obj2);
    }
}
