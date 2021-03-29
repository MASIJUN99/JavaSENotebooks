package sample.java;

public class Car {
    public String brand;
    public String color;

    public void show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

