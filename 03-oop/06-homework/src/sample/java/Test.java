package sample.java;

import sample.java.dao.ExpressDao;
import sample.java.domain.Express;
import sample.java.service.AdminService;
import sample.java.service.UserService;
import sample.java.view.View;

public class Test {

    public static void main(String[] args) {

        View view = new View();
        ExpressDao expressDao = new ExpressDao();
        AdminService adminService = new AdminService(view, expressDao);
        UserService userService = new UserService(view, expressDao);

        while(true) {
            int op1 = view.mainMenu();
            if (op1 == 1) {
                while (true) {
                    int op2 = view.adminMenu();
                    if (op2 == 1) {
                        // 录入
                        System.out.println("录入");
                        adminService.insertExpress();
                    } else if (op2 == 2) {
                        // 删除
                        System.out.println("删除");
                        adminService.delExpress();
                    } else if (op2 == 3) {
                        // 修改
                        System.out.println("修改");
                        adminService.updateInfo();
                    } else if (op2 == 4) {
                        // 查看所有
                        expressDao.printAll();
                    } else if (op2 == 0) {
                        // 退出
                        System.out.println("bye~");
                        break;
                    }
                }
            } else if (op1 == 2) {
                while (true) {
                    int op2 = view.userMenu();
                    if (op2 == 1) {
                        // 取出
                        System.out.println("取出");
                        userService.getExpress();
                    } else if (op2 == 0) {
                        // 退出
                        System.out.println("退出");
                        break;
                    }
                }
            } else if (op1 == 0) {
                System.out.println("bye~");
                break;
            }

        }
    }
}
