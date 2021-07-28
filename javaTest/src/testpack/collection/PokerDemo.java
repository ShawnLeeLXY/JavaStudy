package testpack.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 实现洗牌，发牌，看牌
 */
public class PokerDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        String[] color = {"♦", "♥", "♣", "♠"};
        String[] numStr = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (String s : numStr) {
            for (String ss : color) {
                hm.put(index, ss + s);
                arrList.add(index++);
            }
        }
        hm.put(index, "小王");
        arrList.add(index++);
        hm.put(index, "大王");
        arrList.add(index++);
        Collections.shuffle(arrList);
        TreeSet<Integer> person1 = new TreeSet<Integer>();
        TreeSet<Integer> person2 = new TreeSet<Integer>();
        TreeSet<Integer> person3 = new TreeSet<Integer>();
        TreeSet<Integer> remain = new TreeSet<Integer>();
        for (int i = 0; i < index; i++) {
            if (i >= index - 3) remain.add(arrList.get(i));
            else if (i % 3 == 0) person1.add(arrList.get(i));
            else if (i % 3 == 1) person2.add(arrList.get(i));
            else person3.add(arrList.get(i));
        }
        viewCards("Person1", person1, hm);
        viewCards("Person2", person2, hm);
        viewCards("Person3", person3, hm);
        viewCards("Remain", remain, hm);
    }

    public static void viewCards(String str, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(str + ": ");
        for (Integer i : ts) {
            System.out.print(hm.get(i) + " ");
        }
        System.out.println();
    }
}
