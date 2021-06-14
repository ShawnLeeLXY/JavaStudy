package testpack.cls;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("abc", 18);
        s1.setName("abc");
        s1.setAge(18);
        s1.show();
        s2.show();
    }
}
