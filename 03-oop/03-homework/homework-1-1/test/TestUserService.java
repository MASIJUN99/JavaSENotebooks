import org.junit.Test;
import sample.java.dao.UserDao;
import sample.java.domain.User;
import sample.java.service.UserService;
import sample.java.service.impl.UserServiceImpl;

import java.util.Scanner;

public class TestUserService {

    @Test
    public void testUserService() {
        User user = new User();

        Scanner scanner = new Scanner(System.in);

        // junit不支持win10 IDEA控制台输入，详见https://blog.csdn.net/weixin_40127127/article/details/78186002
//        System.out.println("请输入用户名：");
//        String username = scanner.nextLine();
        String username = "admin";
//        System.out.println("请输入密码：");
//        String password = scanner.nextLine();
        String password = "123";

        user.setUsername(username);
        user.setPassword(password);

        UserService userService = new UserServiceImpl(new UserDao());

        System.out.println(userService.logIn(user));

    }

}
