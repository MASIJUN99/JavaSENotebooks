package sample.java;

public class Shirt {
    private static Integer total = 0;
    private Integer num;
    private String name;
    private String info;

    public Shirt(String name, String info) {
        this.name = name;
        this.info = info;
        setTotal(getTotal()+1);
        this.num = getTotal();
    }

    public Shirt() {
        setTotal(getTotal()+1);
        this.num = getTotal();
    }

    public static Integer getTotal() {
        return total;
    }

    private static void setTotal(Integer total) {
        Shirt.total = total;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
