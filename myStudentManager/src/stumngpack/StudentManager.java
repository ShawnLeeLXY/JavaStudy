package stumngpack;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        String funcLine;
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生信息");
            System.out.println("2 删除学生信息");
            System.out.println("3 修改学生信息");
            System.out.println("4 查看学生信息");
            System.out.println("5 退出");
            System.out.println("请选择一个功能并输入对应数字：");
            funcLine = sc.nextLine();
            switch (funcLine) {
                case "1":
                    System.out.println("添加学生信息");
                    addStu(arr);
                    break;
                case "2":
                    System.out.println("删除学生信息");
                    delStu(arr);
                    break;
                case "3":
                    System.out.println("修改学生信息");
                    updateStu(arr);
                    break;
                case "4":
                    System.out.println("查看所有学生信息");
                    findStu(arr);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
                default:
                    System.out.println("无效的输入！请重新输入（1~5）");
            }
        }
    }

    public static void addStu(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        String sid;
        while (true) {
            System.out.print("请输入学号：");
            sid = sc.nextLine();
            if (isUsed(arr, sid)) {
                System.out.println("你输入的学号已被占用！");
            } else {
                stu.setSid(sid);
                System.out.print("请输入姓名：");
                stu.setName(sc.nextLine());
                System.out.print("请输入年龄：");
                stu.setAge(sc.nextLine());
                System.out.print("请输入地址：");
                stu.setAddress(sc.nextLine());
                System.out.println("添加成功");
                arr.add(stu);
                break;
            }
        }
    }

    public static void delStu(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号：");
        String sid = sc.nextLine();
        int i;
        for (i = 0; i < arr.size(); i++) {
            if (sid.equals(arr.get(i).getSid())) {
                arr.remove(i);
                System.out.println("删除成功");
                break;
            }
        }
        if (i == arr.size()) System.out.println("无此学号！");
    }

    public static void updateStu(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的学号：");
        String sid = sc.nextLine();
        int i;
        for (i = 0; i < arr.size(); i++) {
            if (sid.equals(arr.get(i).getSid())) {
                System.out.print("请输入姓名：");
                arr.get(i).setName(sc.nextLine());
                System.out.print("请输入年龄：");
                arr.get(i).setAge(sc.nextLine());
                System.out.print("请输入地址：");
                arr.get(i).setAddress(sc.nextLine());
                System.out.println("修改成功");
                break;
            }
        }
        if (i == arr.size()) System.out.println("无此学号！");
    }

    public static void findStu(ArrayList<Student> arr) {
        if (arr.size() == 0) {
            System.out.println("没有信息！");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t\t地址");
        for (int i = 0; i < arr.size(); i++) {
            Student stu = arr.get(i);
            System.out.println(stu.getSid() + "\t\t" + stu.getName() + "\t\t\t" + stu.getAge() + "岁\t\t" + stu.getAddress());
        }
    }

    public static boolean isUsed(ArrayList<Student> arr, String sid) {
        for (int i = 0; i < arr.size(); i++) {
            if (sid.equals(arr.get(i).getSid())) {
                return true;
            }
        }
        return false;
    }
}
