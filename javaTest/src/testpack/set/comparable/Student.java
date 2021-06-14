package testpack.set.comparable;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student stu) {
        int num1 = this.age - stu.age;
        int num2 = num1 == 0 ? this.name.compareTo(stu.name) : num1;
        return num2; //0为表示重复
    }
}
