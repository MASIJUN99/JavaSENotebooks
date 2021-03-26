package sample.java;

public class NarcissisticNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (digitsNum(i) == i){
                System.out.println(i);
            }
        }
    }

    public static int digitsNum(int num) {
        int temp = num;
        int ans = 0;
        while (temp > 0) {
            ans += pow((temp % 10), 3);
            temp /= 10;
        }
        return ans;
    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n-1);
    }
}
