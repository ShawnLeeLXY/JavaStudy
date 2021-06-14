package testpack.common;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int month;
        do {
            System.out.print("Please enter the month: ");
            Scanner sc = new Scanner(System.in);
            month = sc.nextInt();
            if (month <= 0 || month > 30) System.out.println("Wrong month number!");
        } while (month <= 0 || month > 30);
        int ans1 = getFibonacci1(month);
        int ans2 = getFibonacci2(month);
        System.out.println("The number of the pair of rabbits is: " + ans1 + " or " + ans2);
    }

    public static int getFibonacci1(int month) {
        int[] num = new int[month + 1];
        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i < num.length; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        return num[month];
    }

    public static int getFibonacci2(int month) {
        if (month == 0) return 0;
        if (month == 1) return 1;
        return getFibonacci2(month - 1) + getFibonacci2(month - 2);
    }
}