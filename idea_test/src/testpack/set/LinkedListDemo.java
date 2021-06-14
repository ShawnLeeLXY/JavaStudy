package testpack.set;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> lklist = new LinkedList<String>();
        lklist.add("hello");
        lklist.add("world");
        lklist.add("java");
        //在该列表开头插入指定的元素
        lklist.addFirst("javase");
        //将指定的元素追加到此列表的末尾
        lklist.addLast("javaee");
        //返回此列表中的第一个元素
        System.out.println(lklist.getFirst());
        //返回此列表中的最后一个元素
        System.out.println(lklist.getLast());
        //从此列表中删除并返回第一个元素
        System.out.println(lklist.removeFirst());
        //从此列表中删除并返回最后一个元素
        System.out.println(lklist.removeLast());
        //输出链表
        System.out.println(lklist);
    }
}
