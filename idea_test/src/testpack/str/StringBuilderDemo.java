package testpack.str;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder strbdr1 = new StringBuilder();
        StringBuilder strbdr2 = strbdr1.append("hello");
        System.out.println("strbdr1: " + strbdr1);
        System.out.println("strbdr2: " + strbdr2);
        System.out.println(strbdr1 == strbdr2);
        //链式编程
        strbdr1.append("Hello").append(" world!").append("java").append("123");
        System.out.println("strbdr1: " + strbdr1);
        //反转
        strbdr1.reverse();
        System.out.println("strbdr1 reversed: " + strbdr1);
        //StringBuilder转String
        String str = strbdr1.toString();
        System.out.println(str);
        //String转StringBuilder
        StringBuilder strbdr3 = new StringBuilder(str);
        System.out.println(strbdr3);
    }
}
