package sample.java;

public class SortAndSearch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 9, 5, 6, 7, 15, 4, 8};
        int target = 6;
        bubbleSortInPlace(nums);
        System.out.println(binarySearch(nums, target));
    }

    private static void bubbleSortInPlace(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (array[i] > array[j]) {
                    // array[i] bigger than array[j]
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static int binarySearch(int[] nums, int target) {
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
