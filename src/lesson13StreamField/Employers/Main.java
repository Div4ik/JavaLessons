package lesson13StreamField.Employers;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = {new Employee("Дмитрий", "Лапицкий",
                "Николаевич", 1, 150_000),
                new Employee("Николай", "Лапицкий",
                        "Николаевич", 1, 200_000),
                new Employee("Антон", "Чупрунов",
                        "Михайлович", 1, 120_000),
                new Employee("Иван", "Коньков",
                        "Леонидович", 1, 90_000)};

        System.out.println(Arrays.toString(employees));
        System.out.println("Ежемесячные затраты на заработную плату составляют: " + AmountOfWages(employees));
        System.out.println("Сотрудник с минимальной ЗП: " + findMinSalaryEmployee(employees));

    }
    
    // метод сумма затрат на з/п
    public static double AmountOfWages(Employee[] employees) {
        double ammount = 0.0;
        for (Employee employee : employees) {
            ammount += employee.getSalary();
        }

        return ammount;
    }

    // метод высчитывающий сотрудника с минимальной ЗП из массива сотрудников
    public static Employee findMinSalaryEmployee (Employee[] employees) {
        Employee minEmployee = employees[0];

        for (int i = 1; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if(currentEmployee.getSalary() <= minEmployee.getSalary()) {
                minEmployee = currentEmployee;
            }
        }
        return minEmployee;
    }



}
