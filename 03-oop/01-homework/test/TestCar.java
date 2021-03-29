import org.junit.Test;
import sample.java.Car;

public class TestCar {
    @Test
    public void testCar() {
        Car car = new Car();
        car.brand = "BMW";
        car.color = "yellow";
        car.show();
    }
}
