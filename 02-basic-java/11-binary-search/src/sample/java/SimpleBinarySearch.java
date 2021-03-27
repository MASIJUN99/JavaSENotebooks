package sample.java;

public class SimpleBinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,9,10,12};
        int target = 7;
        int ans = binarySearch(nums, target);
        if (ans != -1){
            System.out.println("找到了，索引为：" + ans);
        } else {
            System.out.println("没找到");
        }
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                // 查找到
                return mid;
            } else if (nums[mid] <= target) {
                // 待查数较大，左边抛弃
                left = mid + 1;
            } else if (nums[mid] >= target) {
                // 待查数较小，右边抛弃
                right = mid - 1;
            }
        }
        return -1;
    }
}
