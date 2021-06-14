package testpack.reflection;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //方式1
        Class<Student> c1 = Student.class;
        System.out.println(c1);
        //方式2
        Student stu = new Student();
        Class<? extends Student> c2 = stu.getClass();
        System.out.println(c2);
        //方式3
        Class<?> c3 = Class.forName("testpack.reflection.Student");
        System.out.println(c3);
        //结果为ture
        System.out.println(c1 == c2 && c1 == c2);
    }
}
