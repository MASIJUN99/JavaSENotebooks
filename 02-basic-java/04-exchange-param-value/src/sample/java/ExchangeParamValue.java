package sample.java;

public class ExchangeParamValue {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        System.out.println("before exchange");
        System.out.println("a: " + a + '\n' + "b: " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("after exchange:");
        System.out.println("a: " + a + '\n' + "b: " + b);
    }
}
