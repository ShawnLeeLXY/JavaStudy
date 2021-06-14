package testpack.apitest;

import algorithm.Sort;

public class IntegerTest {
    public static void main(String[] args) {
        String str = "37 93 17 52 6 29";
        String[] strArr = str.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        //Arrays.sort(arr);
        Sort.bubleSort(arr);
        StringBuilder strbdr = new StringBuilder();
        strbdr.append("[");
        for (int i = 0; i < arr.length; i++) {
            strbdr.append(arr[i]);
            if (i != arr.length - 1) strbdr.append(", ");
        }
        strbdr.append("]");
        System.out.println(strbdr.toString());
    }
}
