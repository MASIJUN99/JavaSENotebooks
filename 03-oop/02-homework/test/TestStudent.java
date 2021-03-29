import org.junit.Test;
import sample.java.Student;

public class TestStudent {
    @Test
    public void testStudent() {
        // 修改静态属性
        Student.setCompany("开课吧");
        Student.setMajor("Java");

        // 有参构造
        Student student = new Student("学员1", 21, "male", "打牌");
        // 无参构造
        Student student1 = new Student();
        student1.setName("学员2");
        student1.setAge(22);
        student1.setSex("female");
        student1.setHabit("刷抖音");

        // 打印
        student.detail();
        student1.detail();
    }
}
