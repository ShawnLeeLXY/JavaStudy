package testpack.str;

import java.util.Scanner;

public class StringBuilderReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String line = sc.nextLine();
        line = myReverse(line);
        System.out.println("string reversed: " + line);
    }

    public static String myReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
