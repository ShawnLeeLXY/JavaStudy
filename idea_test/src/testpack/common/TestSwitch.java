package testpack.common;

import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        ref();
    }

    public static void ref() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 5: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("The number you entered is 1");
                break;
            case 2:
                System.out.println("The number you entered is 2");
                break;
            case 3:
                System.out.println("The number you entered is 3");
                break;
            case 4:
                System.out.println("The number you entered is 4");
                break;
            case 5:
                System.out.println("The number you entered is 5");
                break;
            default:
                System.out.println("Wrong number!");
        }
    }
}
