package sample.java;

import java.util.Scanner;

public class FindExtremePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        int idx = 0;
        while (idx < 10) {
            nums[idx] = scanner.nextInt();
            if (nums[idx] > maximum) {
                maximum = nums[idx];
            }
            if (nums[idx] < minimum) {
                minimum = nums[idx];
            }
            idx += 1;
        }

        System.out.println("最大值为：" + maximum);
        System.out.println("最小值为：" + minimum);

    }
}
