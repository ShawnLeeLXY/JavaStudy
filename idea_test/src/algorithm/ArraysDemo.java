package algorithm;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr1 = {15, 7, 91, 34, 61, 83};
        System.out.println(arrToStr(arr1));
        Sort.bubleSort(arr1);
        System.out.println(arrToStr(arr1));
        System.out.println("--------");
        int[] arr2 = {15, 7, 91, 34, 61, 83};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static String arrToStr(int[] arr) {
        StringBuilder strbdr = new StringBuilder();
        strbdr.append("[");
        for (int i = 0; i < arr.length; i++) {
            strbdr.append(arr[i]);
            if (i != arr.length - 1) strbdr.append(", ");
        }
        strbdr.append("]");
        return strbdr.toString();
    }
}
