package testpack.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
//向ArrayList<Integer>集合添加字符串
public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Class<? extends ArrayList> aClass = arrayList.getClass();
        Method md = aClass.getMethod("add", Object.class);
        md.invoke(arrayList, "hello");
        md.invoke(arrayList, "world");
        md.invoke(arrayList, "java");
        System.out.println(arrayList);
    }
}
