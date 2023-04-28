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
        System.out.println(AmountOfWages(employees));

    }
    
    // метод сумма затрат на з/п
    public static double AmountOfWages(Employee[] employees) {
        double ammount = 0.0;
        for (Employee employee : employees) {
            ammount += employee.getSalary();
        }

        return ammount;
    }

}
