import org.junit.Test;
import sample.java.Book;

public class TestBook {
    @Test
    public void testBook() {
        // 有参构造
        Book book = new Book("这是一本书", 199);
        // 无参构造
        Book book1 = new Book();
        book1.setTitle("这是另一本书");
        book1.setPageNum(200);

        // detail
        book.detail();
        book1.detail();
    }
}
