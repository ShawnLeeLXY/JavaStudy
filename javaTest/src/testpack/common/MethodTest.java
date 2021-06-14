package testpack.common;
import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a:");
        int a = sc.nextInt();
        System.out.println("Please enter b:");
        int b = sc.nextInt();
        getMax(a, b);
    }

    public static void getMax(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("The max number is " + num1);
        } else {
            System.out.println("The max number is " + num2);
        }
    }
}