package sample.java;

public class GraphPrinter {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }


    public static void demo1(){
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < 5; i++) {
            temp.append("*");
            System.out.println(temp);
        }
    }

    public static void demo2(){
        String temp = "*****";
        for(int i = 0; i < 5; i++) {
            System.out.println(temp.substring(i,5));
        }
    }

    public static void demo3(){
        StringBuilder temp = new StringBuilder("*");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            System.out.println(temp.toString());
            temp.append("*");
            temp.append("*");
        }
    }
}
