package testpack.collection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
//利用TreeMap统计输入字符串中每个字符出现的次数
public class TreeMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String line = sc.nextLine();
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            Integer val = tm.get(ch);
            if (val == null) tm.put(ch, 1); //无此字符则添加字符并设置value为1
            else tm.put(ch, ++val);
        }
        Set<Character> kSet = tm.keySet();
        StringBuilder strbdr = new StringBuilder();
        for (Character c : kSet) {
            strbdr.append(c).append("(").append(tm.get(c)).append(")");
        }
        System.out.println(strbdr);
    }
}
