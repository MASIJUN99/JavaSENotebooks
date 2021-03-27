package sample.java;

public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        int[] ans = binarySearch(nums, target);
        for (int i : ans){
            System.out.println(i);
        }
    }

    public static int[] binarySearch(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int length = nums.length;
        if (length == 0) {
            return new int[]{first, last};
        }
        first = helper(nums, 0, length-1, target);
        while (first > 0 && nums[first-1] == target) {
            first = helper(nums, 0, first-1, target);
        }
        last = helper(nums, first, length-1, target);
        while (last < length-1 && nums[last+1] == target) {
            last = helper(nums, last+1, length-1, target);
        }
        return new int[]{first, last};
    }

    private static int helper(int[] nums, int left, int right, int target) {
        int length = nums.length;
        if (left > right || left < 0 ||right > length-1) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] > target) {
            return helper(nums, left, mid-1, target);
        } else {
            return helper(nums, mid+1, right, target);
        }
    }
}
