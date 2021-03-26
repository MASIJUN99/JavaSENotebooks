package sample.java;

import java.util.Scanner;

public class BasicalInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = scanner.nextInt();
        System.out.println("输入为：" + num);
    }



}
