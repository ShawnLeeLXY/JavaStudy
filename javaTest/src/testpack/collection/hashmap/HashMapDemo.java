package testpack.collection.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HashMap存储学生对象并遍历
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<Student, String>();
        Student stu1 = new Student("Alice", 18);
        Student stu2 = new Student("Betty", 19);
        Student stu3 = new Student("Cindy", 20);
        Student stu4 = new Student("Cindy", 20); //需要重写equals()和hashCode()来确保键的唯一性
        hm.put(stu1, "London");
        hm.put(stu2, "Paris");
        hm.put(stu3, "Sydney");
        hm.put(stu4, "Toronto");
        //遍历方式一：键找值
        Set<Student> keySet = hm.keySet();
        for (Student s : keySet) {
            String val = hm.get(s);
            System.out.println(s.getName() + ", " + s.getAge() + ", " + val);
        }
        System.out.println("--------");
        //遍历方式二：键值对对象找键和值
        Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
        for (Map.Entry<Student, String> m : entrySet) {
            Student stu = m.getKey();
            String str = m.getValue();
            System.out.println(stu.getName() + ", " + stu.getAge() + ", " + str);
        }
    }
}
