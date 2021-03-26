package sample.java;

import java.util.Scanner;

public class StepTariff {
    public static void main(String[] args) {
        System.out.println("请输入用电量：");
        Scanner scanner = new Scanner(System.in);


        if (scanner.hasNextInt()){
            int total = scanner.nextInt();
            if (total >= 0) {
                if (total <= 150){
                    float sum = (float) (total * 0.43);
                    System.out.println("电费为：" + sum);
                } else if (total <= 400) {
                    float sum = (float) ((150 * 0.43) + (total - 150) * 0.45);
                    System.out.println("电费为：" + sum);
                } else {
                    float sum = (float) ((150 * 0.43) + (400 - 150) * 0.45 + (total - 400) * 0.52);
                    System.out.println("电费为：" + sum);
                }
            } else {
                System.out.println("你输入的是个锤子");
            }
        } else {
            System.out.println("你输入的是个锤子");
        }
    }
}
