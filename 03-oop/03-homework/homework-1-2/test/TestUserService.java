import org.junit.Test;
import sample.java.domain.User;
import sample.java.service.UserService;

public class TestUserService {
    @Test
    public void testUserService() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123");

        UserService userService = new UserService();
        System.out.println(userService.logUp(user));
    }
}
