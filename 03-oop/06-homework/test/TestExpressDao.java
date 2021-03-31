import org.junit.Test;
import sample.java.dao.ExpressDao;
import sample.java.domain.Express;
import sample.java.view.View;

import java.util.Objects;

public class TestExpressDao {
    @Test
    public void testExpressDao() {
        ExpressDao expressDao = new ExpressDao();
        Express express = new Express();
        express.setNumber("000001");
        express.setCompany("SF");
        expressDao.add(express);

        Express express1 = new Express();
        express1.setNumber("000002");
        express1.setCompany("YT");
        expressDao.add(express1);

        expressDao.printAll();
        System.out.println("***************************");

        Express express2 = new Express();
        express2.setNumber("000003");
        express2.setCompany("YD");
        expressDao.add(express2);
        expressDao.delete(express1.getNumber());

        System.out.println(expressDao.find("000003"));
        System.out.println(expressDao.find("000002"));

        expressDao.printAll();
        System.out.println("***************************");


    }

    @Test
    public void testMenu() {
        View view = new View();
        int op1 = view.mainMenu();
        if (op1 == 1) {
            int op2 = view.adminMenu();
            if (op2 == 1) {
                // 录入
                System.out.println("录入");

            } else if (op2 == 2){
                // 删除
                System.out.println("删除");
            } else if (op2 == 3){
                // 修改
                System.out.println("修改");
            } else if (op2 == 4){
                // 查看所有
                System.out.println("查看所有");
            } else if (op2 == 0){
                // 退出
                System.out.println("退出");
            }
        } else if (op1 == 2) {
            int op2 = view.userMenu();
            if (op2 == 1) {
                // 取出
                System.out.println("取出");
            } else if (op2 == 0) {
                // 退出
                System.out.println("退出");
            }
        } else if (op1 == 0) {
            System.out.println("bye~");
        }
    }
}
