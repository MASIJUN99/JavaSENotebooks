import org.junit.Test;
import sample.java.Employee;

public class TestEmployee {
    @Test
    public void testEmployee() {
        Employee employee = new Employee();
        employee.salary = (float) (1e5);
        employee.increaseRatio = 0.5f;
        employee.name = "张三";
        employee.number = "007";

        // 姓名
        System.out.println("姓名：" + employee.getName());
        // 号码
        System.out.println("号码：" + employee.getNumber());
        // 基本薪水
        System.out.println("基本薪水：" + employee.getSalary());
        // 增长额
        System.out.println("增长额：" + employee.getIncreaseSalary());
        // 总额
        System.out.println("总额：" + employee.getSalaryAfterIncrease());

    }
}
