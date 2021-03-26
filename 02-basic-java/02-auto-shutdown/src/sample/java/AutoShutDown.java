package sample.java;

import java.io.IOException;

public class AutoShutDown {
    public static void main(String[] args) throws IOException {
//        setShutDown();
        cancelShutDown();
    }

    public static void setShutDown() throws IOException {
        Runtime.getRuntime().exec("shutdown -s -t 3600");
    }

    public static void cancelShutDown() throws IOException {
        Runtime.getRuntime().exec("shutdown -a");
    }
}
