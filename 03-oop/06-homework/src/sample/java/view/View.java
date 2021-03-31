package sample.java.view;

import sample.java.domain.Express;

import java.util.Scanner;

public class View {

    public int mainMenu() {
        System.out.println("******请选择身份******");
        System.out.println("1：快递员");
        System.out.println("2：用户");
        System.out.println("0：没事了");
        Scanner scanner = new Scanner(System.in);
        int selected;
        String temp= scanner.nextLine();
        try {
            selected = Integer.parseInt(temp);
            // System.out.println(selected);
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

    public int userMenu() {
        System.out.println("******你想做什么******");
        System.out.println("1：快递取出");
        System.out.println("0：没事了");
        // 我觉得没必要字符串转数字的方法啊
        Scanner scanner = new Scanner(System.in);
        int selected;
        String temp= scanner.nextLine();
        try {
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

    public int adminMenu() {
        System.out.println("******你想做什么******");
        System.out.println("1：快速录入");
        System.out.println("2：删除快递");
        System.out.println("3：修改快递");
        System.out.println("4：查看所有快递");
        System.out.println("0：没事了");
        // 我觉得没必要字符串转数字的方法啊
        Scanner scanner = new Scanner(System.in);
        int selected;
        String temp= scanner.nextLine();
        try {
            selected = Integer.parseInt(temp);
            System.out.println(selected);
            if (selected < 0 || selected > 4) {
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

    public Express insertInfo() {
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

    public String findByNumber() {
        System.out.println("请输入相应信息：");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入快递单号");
        String s = scanner.nextLine();
        return s;
    }

    public void printExpress(Express express) {
        System.out.println("打印快递信息");
        System.out.println("快递单号：" + express.getNumber());
        System.out.println("快递公司：" + express.getCompany());
        System.out.println("取 件 码：" + express.getCode());
    }

    public void updateInfo(Express express) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入新的快递单号");
        String number = scanner.nextLine();
        System.out.println("请输入新的快递公司");
        String company = scanner.nextLine();
        express.setNumber(number);
        express.setCompany(company);
    }

    public boolean deleteConfirm() {
        System.out.println("是否删除？");
        System.out.println("1：确认");
        System.out.println("0：取消");
        Scanner scanner = new Scanner(System.in);
        int selected;
        String temp= scanner.nextLine();
        try {
            selected = Integer.parseInt(temp);
            System.out.println(selected);
            if (selected < 0 || selected > 1) {
                System.out.println("请输入正确的数字");
                selected = deleteConfirm()? 1 : 0;
            }
            return selected == 1;
        } catch (NumberFormatException ignored) {
            System.out.println("请输入数字");
            selected = deleteConfirm()? 1: 0;
        }
        return selected == 1;
    }

    public boolean getConfirm() {
        System.out.println("是否取出？");
        System.out.println("1：确认");
        System.out.println("0：取消");
        Scanner scanner = new Scanner(System.in);
        int selected;
        String temp= scanner.nextLine();
        try {
            selected = Integer.parseInt(temp);
            System.out.println(selected);
            if (selected < 0 || selected > 1) {
                System.out.println("请输入正确的数字");
                selected = deleteConfirm()? 1 : 0;
            }
            return selected == 1;
        } catch (NumberFormatException ignored) {
            System.out.println("请输入数字");
            selected = deleteConfirm()? 1: 0;
        }
        return selected == 1;
    }

    public int getCode() {
        System.out.println("请输入取件码，输入0退出");
        Scanner scanner = new Scanner(System.in);
        int code;
        try {
            code = Integer.parseInt(scanner.nextLine());
            return code;
        } catch(NumberFormatException ignored) {
            System.out.println("请输入正确的取件码");
            return getCode();
        }
    }

    public String getNumber(String usage) {
        System.out.println("请输入要"+ usage +"的单号，输入0退出");
        Scanner scanner = new Scanner(System.in);
        String delNumber;
        try {
            delNumber = scanner.nextLine();
            if (delNumber.equals("0")) {
                return null;
            }
            return delNumber;
        } catch(NumberFormatException ignored) {
            System.out.println("请输入正确的取件码");
            return getNumber(usage);
        }
    }

}






