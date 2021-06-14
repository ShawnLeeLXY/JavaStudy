package testpack.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
