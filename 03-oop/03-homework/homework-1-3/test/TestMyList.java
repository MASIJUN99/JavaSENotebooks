import org.junit.Test;
import sample.java.MyList;

public class TestMyList {
    @Test
    public void testMyList() {
        MyList myList = new MyList();
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        System.out.println(myList.get(2));
        myList.remove(2);
        System.out.println(myList.get(2));
        myList.add(9);
        System.out.println(myList.length());
        System.out.println(myList.size());

    }
}
