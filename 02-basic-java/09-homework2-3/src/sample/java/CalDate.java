package sample.java;

import javax.management.BadAttributeValueExpException;
import javax.management.RuntimeErrorException;
import java.util.Scanner;

public class CalDate {
    public static void main(String[] args) throws BadAttributeValueExpException {
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入年份");
        if (scanner.hasNextInt()){
            int year = scanner.nextInt();
            System.out.println("请输入月份");
            if (year < 0){
                System.out.println("你输入的是个锤子");
            } else if (scanner.hasNextInt()){
                int month = scanner.nextInt();
                if (month < 0){
                    System.out.println("你输入的是个锤子");
                } else {
                    int day = (month == 2 && isLeapYear(year)) ? 29 : months[month-1];
                    System.out.println(year + "年" + month + "月有" + day + "天");
                }
            } else {
                System.out.println("你输入的是个锤子");
            }
        } else {
            System.out.println("你输入的是个锤子");
        }
    }

    public static boolean isLeapYear(int year) throws BadAttributeValueExpException {
        System.out.println("请输入年份：");

        Scanner scanner = new Scanner(System.in);

        boolean flag = false;  // return flag


        if (year < 0) {
            // System.out.println("你输入的是个锤子");
            throw new BadAttributeValueExpException("你输入的是个锤子");
        } else {
            if (year % 400 == 0){
                flag = true;
            } else if (year % 4 == 0 && year % 100 != 0) {
                flag = true;
            }
            if (flag) {
                // System.out.println(year + "是闰年");
                return true;
            } else {
                // System.out.println(year + "不是闰年");
                return false;
            }
//            return flag;  // simply
        }
    }
}
