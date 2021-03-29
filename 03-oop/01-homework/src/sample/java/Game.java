package sample.java;

public class Game {
    public String name;
    public String category;
    public int size;
    public String level;
    public String info;



    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", size=" + size +
                ", level=" + level +
                ", info='" + info + '\'' +
                '}';
    }
}
