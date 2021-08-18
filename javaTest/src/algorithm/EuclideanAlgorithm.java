package algorithm;

import java.util.Scanner;

/**
 * 欧几里得算法
 * 用于求a和b的最大公约数
 */
public class EuclideanAlgorithm {

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(gcd(a, b));
        }
    }

}
