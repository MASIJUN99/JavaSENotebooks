package sample.java.dao;

import sample.java.domain.User;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserDao {
    public User getUser(String name) {
        // 模拟数据库查找user操作
        if (!name.equals("admin")) {
            //System.out.println("用户名错误");
            return null;
        }
        String username = "admin";
        String password = "123";

        User user = new User();
        user.setUsername(username);
        user.setPassword("123");
        return user;
    }

}