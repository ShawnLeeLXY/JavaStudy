package testpack.collection;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("abc");
        arr.add("def");
        arr.add("ghi");
        arr.add("jkl");
        System.out.println("--------");
        for (int i = 0; i < arr.size(); i++) {
            String str = arr.get(i);
            System.out.println(str);
        }
    }
}
