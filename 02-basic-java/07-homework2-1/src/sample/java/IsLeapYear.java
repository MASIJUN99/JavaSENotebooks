package sample.java;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        System.out.println("请输入年份：");

        Scanner scanner = new Scanner(System.in);

        boolean flag = false;  // return flag

        int year;

        if (scanner.hasNextInt()) {
            year = scanner.nextInt();
            if (year < 0) {
                System.out.println("你输入的是个锤子");
            } else {
                if (year % 400 == 0){
                    flag = true;
                } else if (year % 4 == 0 && year % 100 != 0) {
                    flag = true;
                }
                if (flag) {
                    System.out.println(year + "是闰年");
                } else {
                    System.out.println(year + "不是闰年");
                }
            }
        } else {
            System.out.println("你输入的是个锤子");
        }
    }
}
