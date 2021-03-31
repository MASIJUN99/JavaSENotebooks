package sample.java.service.impl;

import sample.java.dao.UserDao;
import sample.java.domain.User;
import sample.java.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean logIn(User user) {
        User find = userDao.getUser(user.getUsername());

        if (find == null) {
            System.out.println("请输入正确的用户名");
            return false;
        } else {
            if (!user.getPassword().equals(find.getPassword())) {
                System.out.println("请输入正确的密码");
                return false;
            } else {
                System.out.println("登陆成功");
                return true;
            }
        }
    }
}
