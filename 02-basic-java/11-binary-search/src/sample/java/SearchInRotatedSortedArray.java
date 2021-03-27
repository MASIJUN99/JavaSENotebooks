package sample.java;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 1;
        int ans = binarySearch(nums, target);
        if (ans != -1){
            System.out.println("索引为：" + ans);
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
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                // 左边单调增
                if (target >= nums[left] && target < nums[mid]) {
                    // target落在增区间
                    right = mid - 1;
                } else {
                    // 让他继续迭代，直至单调增
                    left = mid + 1;
                }
            } else {
                if (target <= nums[right] && target > nums[mid]) {
                    // target落在增区间（变相增区间）
                    left = mid + 1;
                } else {
                    // 继续迭代
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
