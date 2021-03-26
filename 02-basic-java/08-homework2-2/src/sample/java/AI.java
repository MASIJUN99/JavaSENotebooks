package sample.java;

import java.util.Scanner;

public class AI {
    public static void main(String[] args) {
        // 创建Scanner
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String question = scanner.next();
            // 替换，从问句到陈述句，人称变化。
            question = question.replace("吗", "");
            question = question.replace("吧", "");
            question = question.replace("我", "我也");
            question = question.replace("你", "我");
            question = question.replace("？", "！");
            // 输出
            System.out.println(question);
        }
    }
}
