package sample.java;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int length = nums.length;

        int[] helper = new int[length];

        int idx = 0;
        for (int num : nums) {
            if (num != 0) {
                helper[idx] = num;
                idx += 1;
            }
        }
        for(int num : helper) {
            System.out.println(num);
        }
    }
}
