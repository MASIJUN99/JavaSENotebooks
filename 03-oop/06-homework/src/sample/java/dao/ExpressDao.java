package sample.java.dao;

import sample.java.domain.Express;

import java.util.Random;

public class ExpressDao {

    // init
    int length = 10;
    int width = 10;
    Express[][] expresses = new Express[length][width];
    int capacity = 0;



    /**
     * 添加快递
     * @param express 应当拥有number和company属性，在方法里赋予code属性
     * @return 成功与否，true成功
     */
    public boolean add(Express express) {
        if (capacity >= length * width) {
            System.out.println("柜满了");
            return false;
        } else if (exist(express.getNumber())) {
            System.out.println("单号重复了哥");
            return false;
        }
        // 存放位置
        int xpos, ypos;
        do {
            xpos = (int) (Math.random() * length);
            ypos = (int) (Math.random() * width);
        } while (expresses[xpos][ypos] != null);

        express.setCode(randomCode());

        expresses[xpos][ypos] = express;
        capacity += 1;
        System.out.println("成功");
        return true;
    }

    /**
     * 搞一个唯一的code，用exist()判断
     * @return 若不存在就返回code，若存在就继续
     */
    private int randomCode() {
        // range(100000, 999999) 1e6
        Random random = new Random();
        int newCode;
        do{
            newCode = random.nextInt(800000) + 100000;
        } while (exist(newCode));

        return newCode;
    }

    /**
     * 删除number相同的元素
     * @param number 仅包含number属性即可
     * @return true为成功
     */
    public boolean delete(String number) {
        boolean flag = false;
        for (int l = 0; l < length; l++) {
            for (int w = 0; w < width; w++) {
                if (expresses[l][w] != null && expresses[l][w].getNumber().equals(number)) {
                    expresses[l][w] = null;
                    flag = true;
                    break;
                }
            }
        }
        capacity -= 1;
        return flag;
    }

    /**
     * 删除指定位置的快递
     * @param xpos 横坐标
     * @param ypos 纵坐标
     * @return 成功与否
     */
    public boolean delete(int xpos, int ypos) {
        boolean flag = false;
        if (expresses[xpos][ypos] != null) {
            expresses[xpos][ypos] = null;
            flag = true;
        }
        capacity -= 1;
        return flag;
    }

    /**
     * 找code存不存在，面向用户所以code
     * @param code 只需要一个code属性
     * @return 存在即true 否则为false
     */
    public boolean exist(int code) {
        boolean flag = false;
        for (int l = 0; l < length; l++) {
            for (int w = 0; w < width; w++) {
                if (expresses[l][w] != null && expresses[l][w].getCode().equals(code)) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    /**
     * 查找单号存不存在
     * @param number 只需要一个number属性
     * @return 存在即true 否则为false
     */
    public boolean exist(String number) {
        boolean flag = false;
        for (int l = 0; l < length; l++) {
            for (int w = 0; w < width; w++) {
                if (expresses[l][w] != null && expresses[l][w].getNumber().equals(number)) {
                    flag = true;
                    break;
                }
            }
        }

        return flag;
    }

    /**
     * 查找快递
     * @param number 只需要一个number属性
     * @return
     */
    public Express find(String number) {
        Express found = null;
        for (int l = 0; l < length; l++) {
            for (int w = 0; w < width; w++) {
                if (expresses[l][w] != null && expresses[l][w].getNumber().equals(number)) {
                    found = expresses[l][w];
                    break;
                }
            }
        }
        return found;
    }

    /**
     * 通过code寻找快递是否存在，返回这个快递。
     * @param code
     * @return
     */
    public int[] find(int code) {
        int l = -1;
        int w = -1;
        boolean flag = false;
        for (l = 0; l < length; l++) {
            for (w = 0; w < width; w++) {
                if (expresses[l][w] != null && expresses[l][w].getCode().equals(code)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return flag ? new int[]{l, w} : null;
    }

    /**
     * 找指定位置的快递
     * @param pos
     * @return
     */
    public Express getExpress(int[] pos) {
        return expresses[pos[0]][pos[1]]!=null ? expresses[pos[0]][pos[1]] : null;
    }

    /**
     * 面向快递员，所以只需要number属性，code不变
     * @param express 需要修改的公司及想修改的单号放进去。
     */
    public boolean update(Express express) {
        boolean flag = false;
        for (int l = 0; l < length; l++) {
            for (int w = 0; w < width; w++) {
                if (expresses[l][w].getNumber().equals(express.getNumber())) {
                    express.setCode(expresses[l][w].getCode());
                    expresses[l][w] = express;
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    /**
     * 若全改，用这个重载，输入一个number把对应express的换成express，code不变
     * @param number 想修改的单号
     * @param express 新单号新公司放进去
     */
    public boolean update(String number, Express express) {
        boolean flag = false;
        for (int l = 0; l < length; l++) {
            for (int w = 0; w < width; w++) {
                if (expresses[l][w].getNumber().equals(number)) {
                    express.setCode(expresses[l][w].getCode());
                    expresses[l][w] = express;
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    /**
     * 全部打印
     */
    public void printAll() {
        if (capacity < 1) {
            System.out.println("空空如也");
            return;
        }
        int idx = 0;
        for (int l = 0; l < length; l++) {
            for (int w = 0; w < width; w++) {
                if (expresses[l][w] != null) {
                    System.out.println("*************第" + ++idx + "个*************");
                    System.out.printf("快递位置在第%d行%d列\n单号是：%s\n公司是：%s\n取件码为：%s\n",
                            l, w, expresses[l][w].getNumber(), expresses[l][w].getCompany(), expresses[l][w].getCode());
                }
            }
        }
    }

}
