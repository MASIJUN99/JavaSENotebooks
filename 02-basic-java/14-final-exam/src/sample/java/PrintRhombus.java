package sample.java;

import java.util.Scanner;

public class PrintRhombus {

    public static void main(String[] args) {
        System.out.print("请输入空心菱形的行数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printRhombus(n);
    }

    public static void printRhombus(int n){
        boolean flag = n % 2 == 0;

        int[] spaceNum = new int[n];

        for (int i = 0; i < (n+1)/2; i++) {
            spaceNum[i] = (n+1)/2 - i - 1;
            spaceNum[n-i-1] = (n+1)/2 - i - 1;
        }

        for(int i = 0; i < n; i++) {
            if (i == 0 || i == n-1) {
                if (flag) {
                    for (int j = 0; j < spaceNum[i]; j++){
                        System.out.print(' ');
                    }
                    System.out.print("**");
                    for (int j = 0; j < spaceNum[i]; j++){
                        System.out.print(' ');
                    }
                } else {
                    for (int j = 0; j < spaceNum[i]; j++){
                        System.out.print(' ');
                    }
                    System.out.print("*");
                    for (int j = 0; j < spaceNum[i]; j++){
                        System.out.print(' ');
                    }
                }
            } else {
                for (int j = 0; j < spaceNum[i]; j++){
                    System.out.print(' ');
                }
                System.out.print("*");
                if (flag) {
                    for (int j = 0; j < 2 * (n / 2 - spaceNum[i] - 1); j++){
                        System.out.print(' ');
                    }
                } else {
                    for (int j = 0; j < 2 * ((n+1) / 2 - spaceNum[i] - 1) - 1; j++){
                        System.out.print(' ');
                    }
                }
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }
}
