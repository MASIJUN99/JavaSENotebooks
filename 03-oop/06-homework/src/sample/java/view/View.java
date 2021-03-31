package sample.java.view;

import sample.java.domain.Express;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        System.out.println("你选择的是" + userMenu());
    }

    public static int mainMenu() {
        System.out.println("请选择身份");
        System.out.println("1：快递员");
        System.out.println("2：用户");
        System.out.println("0：没事了");
        Scanner scanner = new Scanner(System.in);
        int selected;
        try {
            String temp= scanner.nextLine();
            selected = Integer.parseInt(temp);
            System.out.println(selected);
            if (selected < 0 || selected > 2) {
                System.out.println("请输入正确的数字");
                selected = mainMenu();
            }
            return selected;
        } catch (NumberFormatException ignored) {
            System.out.println("请输入数字");
            selected = mainMenu();
        }
        return selected;
    }

    public static int userMenu() {
        System.out.println("你想做什么");
        System.out.println("1：快递取出");
        System.out.println("0：没事了");
        // 我觉得没必要字符串转数字的方法啊
        Scanner scanner = new Scanner(System.in);
        int selected;
        try {
            String temp= scanner.nextLine();
            selected = Integer.parseInt(temp);
            System.out.println(selected);
            if (selected < 0 || selected > 1) {
                System.out.println("请输入正确的数字");
                selected = userMenu();
            }
            return selected;
        } catch (NumberFormatException ignored) {
            System.out.println("请输入数字");
            selected = userMenu();
        }
        return selected;

    }

    public static int adminMenu() {
        System.out.println("你想做什么");
        System.out.println("1：快速录入");
        System.out.println("2：删除快递");
        System.out.println("3：修改快递");
        System.out.println("4：查看所有快递");
        System.out.println("0：没事了");
        // 我觉得没必要字符串转数字的方法啊
        Scanner scanner = new Scanner(System.in);
        int selected;
        try {
            String temp= scanner.nextLine();
            selected = Integer.parseInt(temp);
            System.out.println(selected);
            if (selected < 0 || selected > 2) {
                System.out.println("请输入正确的数字");
                selected = adminMenu();
            }
            return selected;
        } catch (NumberFormatException ignored) {
            System.out.println("请输入数字");
            selected = adminMenu();
        }
        return selected;
    }

    public static Express insertInfo() {
        Express express = new Express();
        System.out.println("请输入相应信息：");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入快递单号");
        String number = scanner.nextLine();
        express.setNumber(number);
        System.out.println("请输入快递公司");
        String company = scanner.nextLine();
        express.setCompany(company);
        return express;
    }

    public static String findByNumber() {
        System.out.println("请输入相应信息：");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入快递单号");
        String s = scanner.nextLine();
        return s;
    }

    public static void printExpress(Express express) {
        System.out.println("打印快递信息");
        System.out.println("快递单号：" + express.getNumber());
        System.out.println("快递公司：" + express.getCompany());
        System.out.println("取 件 码：" + express.getCode());
    }

    public static void updateInfo(Express express) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入新的快递单号");
        String number = scanner.nextLine();
        System.out.println("请输入新的快递公司");
        String company = scanner.nextLine();
        express.setNumber(number);
        express.setCompany(company);
    }

    public static boolean deleteExpress() {
        System.out.println("是否删除？");
        System.out.println("1：确认");
        System.out.println("0：取消");
        Scanner scanner = new Scanner(System.in);
        int selected;
        try {
            String temp= scanner.nextLine();
            selected = Integer.parseInt(temp);
            System.out.println(selected);
            if (selected < 0 || selected > 1) {
                System.out.println("请输入正确的数字");
                selected = deleteExpress()? 1 : 0;
            }
            return selected == 1;
        } catch (NumberFormatException ignored) {
            System.out.println("请输入数字");
            selected = deleteExpress()? 1: 0;
        }
        return selected == 1;
    }
}






