package sample.java;

import org.w3c.dom.NameList;

public class ReturnWithFinally {
    public static void main(String[] args) {
        System.out.println(returnSimpleParam());
        System.out.println(returnRefParam());
    }

    private static int returnSimpleParam() {
        User user = new User();
        try {
            user.age = 18;
            user.name = "张三";
            return user.age;
        } catch(RuntimeException exception) {
            return -1;
        } finally {
            user.age = 20;
            user.name = "李四";
        }
    }

    private static User returnRefParam() {
        User user = new User();
        try {
            user.age = 18;
            user.name = "张三";
            return user;
        } catch(RuntimeException exception) {
            return null;
        } finally {
            user.age = 20;
            user.name = "李四";
        }
    }

    private static class User {
        private String name;
        private int age;

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}

