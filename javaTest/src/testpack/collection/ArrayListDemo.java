package testpack.collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList<String> arr = new ArrayList<>(); //java7以后支持的声明方式
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");
        System.out.println("array: " + arr);
        arr.add(1, "javase");
        System.out.println("array: " + arr);
        //删除指定的元素，返回删除是否成功
        System.out.println(arr.remove("world"));
        //删除指定索引处的元素，返回被删除的元素
        System.out.println(arr.remove(1));
        //修改指定索引处的元素，返回被修改的元素
        System.out.println(arr.set(1, "javaee"));
        //返回指定索引处的元素
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        //返回集合中的元素个数
        System.out.println(arr.size());
    }
}
