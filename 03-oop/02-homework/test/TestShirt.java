import org.junit.Test;
import sample.java.Shirt;

public class TestShirt {
    @Test
    public void testShirt() {
        Shirt shirt = new Shirt();
        shirt.setName("1st");
        shirt.setInfo("this is the first shirt");

        Shirt shirt1 = new Shirt();
        shirt1.setName("2nd");
        shirt1.setInfo("this is the second shirt");

        System.out.println(shirt);
        System.out.println(shirt1);
    }
}
