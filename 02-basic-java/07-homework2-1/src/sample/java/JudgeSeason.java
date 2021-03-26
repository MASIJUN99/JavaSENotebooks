package sample.java;

import java.util.Scanner;

public class JudgeSeason {
    public static void main(String[] args) {
        String[] seasons = {"冬", "春", "夏", "秋"};
        System.out.println("输入月份：");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()){
            int month = scanner.nextInt();
            if (month > 0 && month <= 12) {
                int index = month % 12 / 3;
                System.out.println(month + "月是" + seasons[index] + "季");
            } else {
                System.out.println("你输入的是个锤子");
            }
        } else {
            System.out.println("你输入的是个锤子");
        }
    }
}
