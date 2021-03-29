package sample.java;

public class Employee {
    public String name;
    public String number;
    public float salary;
    public float increaseRatio;

    public Employee(String name, String number, int salary, int increaseRatio) {
        this.name = name;
        this.number = number;
        this.salary = salary;
        this.increaseRatio = increaseRatio;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public float getSalary() {
        return salary;
    }

    /**
     * 计算薪水增长额
     * @return 薪水增长额
     */
    public float getIncreaseSalary() {
        return increaseRatio * getSalary();
    }

    /**
     * 计算增长后总工资
     * @return 增长后总工资
     */
    public float getSalaryAfterIncrease() {
        return getIncreaseSalary() + getSalary();
    }
}
