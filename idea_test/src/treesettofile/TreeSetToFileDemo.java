package treesettofile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                int num1 = stu2.getSum() - stu1.getSum();
                int num2 = num1 == 0 ? stu2.getChinese() - stu1.getChinese() : num1;
                int num3 = num2 == 0 ? stu2.getMath() - stu1.getMath() : num2;
                int num4 = num3 == 0 ? stu2.getName().compareTo(stu1.getName()) : num3;
                return num4;
            }
        });
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入姓名（输入0则结束录入）：");
            String name = sc.nextLine();
            if (name.equals("0")) break;
            Student stu = new Student();
            stu.setName(name);
            System.out.println("请输入语文成绩：");
            int chinese = sc.nextInt();
            stu.setChinese(chinese);
            System.out.println("请输入数学成绩：");
            int math = sc.nextInt();
            stu.setMath(math);
            System.out.println("请输入英语成绩：");
            int english = sc.nextInt();
            stu.setEnglish(english);
            ts.add(stu);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("idea_test\\studentfile"));
        for (Student s : ts) {
            StringBuilder strbdr = new StringBuilder();
            strbdr.append(s.getName()).append(", ").append(s.getChinese()).append(", ").append(s.getMath()).append(", ").append(s.getEnglish()).append(", ").append(s.getSum());
            bw.write(strbdr.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
