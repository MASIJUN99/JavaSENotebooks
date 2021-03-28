package sample.java;

public class ExchangeParam {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        System.out.println("before exchange");
        System.out.println("a: " + a + '\n' + "b: " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("after exchange:");
        System.out.println("a: " + a + '\n' + "b: " + b);
    }
}
