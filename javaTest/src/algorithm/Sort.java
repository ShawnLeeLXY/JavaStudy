package algorithm;

public class Sort {
    public Sort() {
    }

    public static void bubleSort(int[] num) {
        int times = 1;
        for (int i = 1; i < num.length && times > 0; i++) {
            times = 0;
            for (int j = 0; j < num.length - i; j++) {
                if (num[j] > num[j + 1]) {
                    num[j] ^= num[j + 1];
                    num[j + 1] ^= num[j];
                    num[j] ^= num[j + 1];
                    times++;
                }
            }
        }
    }

}
