package testpack.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                int num1 = stu1.getAge() - stu2.getAge();
                int num2 = num1 == 0 ? stu1.getName().compareTo(stu2.getName()) : num1;
                return num2;
            }
        });
        Student stu1 = new Student("xishi", 19);
        Student stu2 = new Student("wangzhaojun", 18);
        Student stu3 = new Student("diaochan", 20);
        Student stu4 = new Student("yangyuhuan", 23);
        Student stu5 = new Student("linqinxia", 23);
        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);
        ts.add(stu4);
        ts.add(stu5);
        for (Student s : ts) {
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
