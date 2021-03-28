package sample.java;

import java.util.Scanner;

public class FindInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        int idx = 0;
        while (idx < 10) {
            nums[idx] = scanner.nextInt();
            idx += 1;
        }

        int target = scanner.nextInt();

        boolean flag = false;
        int index = -1;
        for (int i = 0; i < 10; i++) {
            if (nums[i] == target) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.println("找到了，索引为：" + index);
        } else {
            System.out.println("没找到");
        }
    }
}
