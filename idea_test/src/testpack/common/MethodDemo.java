package testpack.common;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(compare(10, 20));
    }

    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    public static boolean compare(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    public static boolean compare(long a, long b) {
        System.out.println("long");
        return a == b;
    }
}