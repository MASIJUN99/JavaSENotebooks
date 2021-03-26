package sample.java;


public class DigitsSum {
    public static void main(String[] args) {
        int random = 12321;
        int temp = random;
        Integer ans = 0;
        while (temp != 0) {
            ans += temp % 10;
            temp /= 10;
        }
        System.out.println(ans);
    }
}
