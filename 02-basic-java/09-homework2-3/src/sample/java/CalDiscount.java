package sample.java;

import java.util.Scanner;

public class CalDiscount {
    public static void main(String[] args) {
        float[] discount = {0.9F, 0.8F, 0.75F, 0.7F};

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额");
        if (scanner.hasNextInt()){
            int money = scanner.nextInt();
            System.out.println("请输入积分");
            if (money < 0) {
                System.out.println("你输入的是个锤子");
            } else if (scanner.hasNextInt()) {

                int credits = scanner.nextInt();
                if (credits < 0) {
                    System.out.println("你输入的是个锤子");
                } else {
                    if (credits <= 2000) {
                        float moneyAfterDiscount = discount[0] * money;
                        System.out.println("折后" + moneyAfterDiscount + "元");
                    } else if (credits <= 4000) {
                        float moneyAfterDiscount = discount[1] * money;
                        System.out.println("折后" + moneyAfterDiscount + "元");
                    } else if (credits <= 6000) {
                        float moneyAfterDiscount = discount[2] * money;
                        System.out.println("折后" + moneyAfterDiscount + "元");
                    } else {
                        float moneyAfterDiscount = discount[3] * money;
                        System.out.println("折后" + moneyAfterDiscount + "元");
                    }
                }
            } else {
                System.out.println("你输入的是个锤子");
            }
        } else {
            System.out.println("你输入的是个锤子");
        }
    }
}
