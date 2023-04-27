package lesson13StreamField.Employers;

public class Employee {
    private String name;
    private String surName;
    private String patronymic;
    private int department;
    private double salary;
    private static int count = 1;
    private int id;

    public Employee(String name, String surName, String patronymic, int department, double salary, int id) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
