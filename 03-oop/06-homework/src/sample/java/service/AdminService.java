package sample.java.service;

import sample.java.dao.ExpressDao;
import sample.java.domain.Express;
import sample.java.view.View;

public class AdminService {

    View view;
    ExpressDao expressDao;

    public AdminService(View view, ExpressDao expressDao) {
        this.view = view;
        this.expressDao = expressDao;
    }

    public void delExpress() {
        // 删除逻辑

        String delNumber = view.getNumber("删除");
        Express delExpress = expressDao.find(delNumber);
        boolean flag = delNumber != null;
        while (delNumber != null && delExpress == null) {
            System.out.println("单号不存在，请确认");
            delNumber = view.getNumber("删除");
            if (delNumber == null) {
                flag = false;
                break;
            }
            delExpress = expressDao.find(delNumber);
            flag = true;
        }
        if (flag) {
            System.out.println("要删除的快递是");
            view.printExpress(delExpress);
            if (view.deleteConfirm()) {
                if (expressDao.delete(delNumber)) {
                    System.out.println("删除成功");
                } else {
                    System.out.println("删除失败，不存在");
                }
            }
        }
    }

    public void insertExpress() {
        Express express = view.insertInfo();
        expressDao.add(express);
    }

    public void updateInfo() {

        String updateNumber = view.getNumber("修改");
        Express updateExpress = expressDao.find(updateNumber);
        boolean flag = updateNumber != null;
        while (updateNumber != null && updateExpress == null) {
            System.out.println("单号不存在，请确认");
            updateNumber = view.getNumber("修改");
            if (updateNumber == null) {
                flag = false;
                break;
            }
            updateExpress = expressDao.find(updateNumber);
            flag = true;
        }
        if (flag) {
            System.out.println("要修改的快递是");
            view.printExpress(updateExpress);
            view.updateInfo(updateExpress);
            System.out.println("success");
        }
    }



}
