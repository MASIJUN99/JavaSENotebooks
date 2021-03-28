package sample.java;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSumOptimizing(nums, target);
        int[] ans2 = twoSum(nums, target);

        System.out.print(ans[0]);
        System.out.print(' ');
        System.out.println(ans[1]);

        System.out.print(ans2[0]);
        System.out.print(' ');
        System.out.println(ans2[1]);
    }

    /**
     * 双重循环
     */
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};

    }

    public static int[] twoSumOptimizing(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            } else {
                hashtable.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
