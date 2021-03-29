package sample.java;

import javax.naming.directory.InvalidAttributeValueException;

public class Student{
    private String name;
    private Integer age;
    private String sex;
    private String habit;
    private static String company;
    private static String major;

    public Student(String name, Integer age, String sex, String habit) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.habit = habit;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Student.company = company;
    }

    public static String getMajor() {
        return major;
    }

    public static void setMajor(String major) {
        Student.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", habit='" + habit + '\'' +
                ", company='" + company + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public void detail() {
        System.out.println(this);
    }
}
