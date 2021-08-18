package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeSieve {

    /**
     * 素数筛
     * 遍历范围内的素数 将该数乘积得到合数标记为1
     * nums[0]记录筛到的素数个数
     * 从1往后依次覆盖筛到的素数值
     *
     * @param nums 操作数组
     */
    private static void primeSieve(int[] nums) {
        int n = nums.length - 1;
        for (int i = 2; i <= n; i++) {
            if (nums[i] != 0) continue;
            nums[++nums[0]] = i;
            for (int j = i * i; j <= n; j += i) {
                nums[j] = 1;
            }
        }
    }

    /**
     * 线性筛
     * 关键在于if (i % nums[j] == 0)这里及时break了循环 避免了重复标记
     *
     * @param nums
     */
    private static void linearSieve(int[] nums) {
        int n = nums.length - 1;
        for (int i = 2; i <= n; i++) {
            if (nums[i] == 0) {
                nums[++nums[0]] = i;
            }
            for (int j = 1; j <= nums[0] && nums[j] * i <= n; j++) {
                nums[nums[j] * i] = 1;
                if (i % nums[j] == 0) break;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n + 1];
            primeSieve(nums);
            System.out.println("素数筛：");
            for (int i = 1; i <= nums[0]; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            Arrays.fill(nums, 0);
            linearSieve(nums);
            System.out.println("线性筛：");
            for (int i = 1; i <= nums[0]; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
    }

}
