package sample.java;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        try {
            doDosCommand(command);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("请输入正确dos指令");
        }
    }

    /** 什么才是异常抛出去的时机？
     *
     * 谁导致的异常，就抛给谁。
     * 比如说这个，抛给输入command字符串的函数
     * @param command Dos command.
     * @throws IOException Maybe the command was a wrong dos command.
     */
    public static void doDosCommand(String command) throws IOException {
        Runtime.getRuntime().exec(command);
    }
}
