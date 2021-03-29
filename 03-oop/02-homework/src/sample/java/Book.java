package sample.java;

import javax.management.relation.InvalidRoleValueException;
import javax.naming.directory.InvalidAttributeValueException;

public class Book {
    private String title;
    private int pageNum;

    public Book(String title, int pageNum) {
        this.title = title;
        if (pageNum < 200) {
            this.pageNum = 200;
//            throw new IllegalArgumentException("页数请大于200");
            System.out.println("页数请大于200，默认设为200");
        } else {
            this.pageNum = pageNum;
        }
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum < 200) {
            this.pageNum = 200;
//            throw new IllegalArgumentException("页数请大于200");
            System.out.println("页数请大于200，默认设为200");
        } else {
            this.pageNum = pageNum;
        }
    }

    public void detail() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }
}
