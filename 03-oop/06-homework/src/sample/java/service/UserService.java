package sample.java.service;

import sample.java.dao.ExpressDao;
import sample.java.domain.Express;
import sample.java.view.View;

public class UserService {

    View view;
    ExpressDao expressDao;

    public UserService(View view, ExpressDao expressDao) {
        this.view = view;
        this.expressDao = expressDao;
    }

    public void getExpress() {
        // 取出逻辑

        int code = view.getCode();
        int[] pos = expressDao.find(code);
        boolean flag = code != 0;
        while(code != 0 && pos == null) {
            code = view.getCode();
            if (code == 0) {
                flag = false;
                break;
            }
            pos = expressDao.find(code);
            flag = true;
        }
        if (flag) {
            System.out.println("你要取出的是" + pos[0] + pos[1]);
            Express express = expressDao.getExpress(pos);
            view.printExpress(express);
            if (view.getConfirm()) {
                if (expressDao.delete(express.getNumber())) {
                    System.out.println("取出成功");
                } else {
                    System.out.println("取出失败，不存在");
                }
            }
        }
    }

}
