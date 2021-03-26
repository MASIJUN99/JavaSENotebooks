package sample.java;

/**
 * judge palindromic integer
 */
public class PalindromicInteger {
    public static void main(String[] args) {
        int random = 12321;
        int n = (int) StrictMath.log10(random);
        int temp = random;
        Integer another = 0;
        while (temp != 0) {
            another += pow(10, n) * (temp % 10);
            temp /= 10;
            n -= 1;
        }
        System.out.println(another.equals(random));
    }

    public static Integer pow(Integer x, int n) {
        if (n == 0){
            return 1;
        }
        return x * pow(x, n - 1);
    }
}
