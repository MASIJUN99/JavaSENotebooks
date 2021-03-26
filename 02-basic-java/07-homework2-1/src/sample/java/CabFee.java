package sample.java;

import java.util.Scanner;

public class CabFee {
    public static void main(String[] args) {
        System.out.println("请输入里程：");

        Scanner scanner = new Scanner(System.in);

        int fee = 8;

        if (scanner.hasNextInt()) {
            int dis = scanner.nextInt();
            if (dis > 2) {
                fee += (dis - 2) * 4.5;
            }
        } else {
            System.out.println("你输入的是个锤子");
        }

        System.out.println("费用为：" + fee);
    }
}
