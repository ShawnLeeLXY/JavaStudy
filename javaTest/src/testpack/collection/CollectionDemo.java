package testpack.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<Student> clnStu = new ArrayList<Student>();
        //创建Student对象
        Student stu1 = new Student("Alice", 18);
        Student stu2 = new Student("Betty", 19);
        Student stu3 = new Student("Cindy", 20);
        //将Student对象添加到集合中
        clnStu.add(stu1);
        clnStu.add(stu2);
        clnStu.add(stu3);
        //通过迭代器遍历集合
        Iterator<Student> it = clnStu.iterator();
        while (it.hasNext()) {
            Student str = it.next();
            System.out.println(str.getName() + ", " + str.getAge());
        }
    }
}
