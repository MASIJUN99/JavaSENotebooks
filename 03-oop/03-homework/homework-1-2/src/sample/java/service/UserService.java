package sample.java.service;

import sample.java.domain.User;

public class UserService {
    public boolean logUp(User user) {
        User refUser = new User();
        refUser.setUsername("admin");
        refUser.setPassword("123");

        if (!user.getUsername().equals("admin")) {
            System.out.println("请输入正确的用户名");
            return false;
        } else {
            if (!user.getPassword().equals(user.getPassword())) {
                System.out.println("请输入正确的密码");
                return false;
            } else {
                System.out.println("登陆成功");
                return true;
            }
        }
    }
}
