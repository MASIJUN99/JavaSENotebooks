package sample.java;

import java.awt.print.PrinterGraphics;

public class DecimalToBinaryConverter {

    public static void main(String[] args) {
//        convertByJava()
        String s = systemToSystem("101000", 2, 16);
        System.out.println(s);
    }

    /**
     * using Java Integer Class
     */
    public static void convertByJava() {
        int num = 40;
        String str = Integer.toString(num); // 将数字转换成字符串
        String str1 = Integer.toBinaryString(num); // 将数字转换成二进制
        String str2 = Integer.toHexString(num); // 将数字转换成八进制
        String str3 = Integer.toOctalString(num); // 将数字转换成十六进制
        System.out.println(str + "的二进制数是：" + str1);
        System.out.println(str + "的八进制数是：" + str3);
        System.out.println(str + "的十进制数是：" + str);
        System.out.println(str + "的十六进制数是：" + str2);
        System.out.println(Integer.parseInt(str1, 2));
    }

    /**
     * Convert the N system number to another target N system
     * @param num: input N system num
     * @param N: input system
     * @param targetN: target system
     * @return a String of target system number
     */
    public static String systemToSystem(String num, Integer N, Integer targetN) {
        return decimalToN(nToDecimal(num, N),targetN);
    }

    public static Integer pow(Integer x, Integer a) {
        if (a == 0) {
            return 1;
        }
        return x * pow(x, a-1);
    }

    public static String decimalToN(Integer decimal, Integer targetN) {
        StringBuilder buf = new StringBuilder();
        String code = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (decimal != 0) {
            int temp = decimal % targetN;
            buf.append(code.charAt(temp));
            decimal /= targetN;
        }
        buf.reverse();
        return buf.toString();
    }

    public static Integer nToDecimal(String nSystem, Integer N) {
        StringBuilder stringBuilder = new StringBuilder(nSystem);
        stringBuilder.reverse();
        Integer result = 0;
        for (int i = 0; i < stringBuilder.length(); i++){
            char bitCh = stringBuilder.charAt(i);
            if (bitCh >= '0' && bitCh <= '9') {
                result += (int) (bitCh - '0') * pow(N, i);
            } else if (bitCh >= 'A' && bitCh <= 'Z') {
                result += ((int) (bitCh - 'A') + 10) * pow(N, i);
            } else if (bitCh >= 'a' && bitCh <= 'z'){
                result += ((int) (bitCh - 'a') + 10) * pow(N, i);
            }
        }
        return result;
    }
}
