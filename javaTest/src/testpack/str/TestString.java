package testpack.str;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = reverseString(str);
        System.out.println(str);
    }

    //字符串拼接方法
    public static String arrayToString(int[] arr) {
        if (arr == null) return null;
        if (arr.length == 0) return "[]";
        String str = "";
        str += "[";
        str += arr[0];
        for (int i = 1; i < arr.length; i++) {
            str += ", ";
            str += arr[i];
        }
        str += "]";
        return str;
    }

    //字符串反转方法
    public static String reverseString(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }
}
