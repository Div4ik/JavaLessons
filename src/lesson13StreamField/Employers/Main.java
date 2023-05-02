package lesson13StreamField.Employers;

import java.util.Arrays;
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
                        "Леонидович", 1, 90_000), null, null, null, null, null, null};


        System.out.println(Arrays.toString(employees));
        System.out.println("Ежемесячные затраты на заработную плату составляют: " + CalculateAmountOfWages(employees));
        System.out.println("Сотрудник с минимальной ЗП: " + FindMinSalaryEmployee(employees));
        System.out.println("Сотрудник с максимальной ЗП: " + FindMaxSalaryEmployee(employees));
        System.out.println("Средняя зарплата сотрудников: " + CalculateAverageSalary(employees));

        System.out.println("employeeNew.getCount() = " + Employee.getCount());

        RemoveEmployee(employees, "Олень", "Иван");





        System.out.println("employeeNew.getCount() = " + Employee.getCount());

        AddEmployee(employees, "Ваганов", "Антон");

        System.out.println(Arrays.toString(employees));

        PrintCountEmployees();

//        System.arraycopy();


    }

    // метод сумма затрат на з/п
    public static double CalculateAmountOfWages(Employee[] employees) {
        double ammount = 0.0;
        for (int i = 0; i < employees[0].getCount(); i++) {
            ammount += employees[i].getSalary();
        }


        return ammount;
    }

    // метод высчитывающий сотрудника с минимальной ЗП из массива сотрудников
    public static Employee FindMinSalaryEmployee(Employee[] employees) {
        Employee minEmployee = employees[0];

        for (int i = 1; i < minEmployee.getCount(); i++) {
            Employee currentEmployee = employees[i];
            if (currentEmployee.getSalary() < minEmployee.getSalary()) {
                minEmployee = currentEmployee;
            }
        }
        return minEmployee;
    }

    public static Employee FindMaxSalaryEmployee(Employee[] employees) {
        Employee maxEmployee = employees[0];

        for (int i = 1; i < maxEmployee.getCount(); i++) {
            Employee currentEmployee = employees[i];
            if (currentEmployee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = currentEmployee;
            }
        }
        return maxEmployee;
    }

    // Метод возвращающий среднюю з/п из массива сотрудников.
    public static double CalculateAverageSalary(Employee[] employees) {

        return CalculateAmountOfWages(employees) / employees[0].getCount();

    }

    // Метод удаляет из массива employees объект по фамилии и имени, метод ничего возвращает,
    // т.к. менять будем массив по ссылке, которую передаем
    public static void RemoveEmployee(Employee[] employees, String lastName, String firstName) {

        // Счетчик count в отдельной переменной, т.к. позже мы можем уменьшить Employee.setCount на 1.
        int count = Employee.getCount();

        // Перебираем все элементы массива, которые записаны (не являются null)
        for (int i = 0; i < count; i++) {

            // Предварительно проверяем не является ли null объект, иначе возможна ошибка у нас на последнем проходе, что объект является null
            if (employees[i] != null && employees[i].getLastName().equals(lastName) && employees[i].getFirstName().equals(firstName)) {

                employees[i] = null; // Мы нашли объект который нужно удалить, поэтому обнуляем текущий элемент массива
                Employee.setCount(Employee.getCount() - 1); // уменьшаем счетчик на 1
            }

            // Если предыдущий элемент оказался обнуленным, то надо текущий в него перенести.
            if (i != 0 && employees[i - 1] == null) { // проверка если i не равно 0, чтобы правая часть условия не выдало ошибку если искомый элемент окажется в 0 позиции.
                employees[i - 1] = employees[i]; // записываем текущий элемент в предыдущий, чтобы убрать дырку null в массиве
                employees[i] = null; // текущий обнуляем, чтобы алгоритм с переносом элементов массива сработал в следующей итерации цикла

            }
        }


    }


    // Добавление сотрудника в массив employees.
    public static void AddEmployee(Employee[] employees, String lastName, String firstName) {

        int count = Employee.getCount();

        // Если уже 10 сотрудников, то по условию задания больше добавить не можем - выводим отказ
        if (count == 10) {
            System.out.printf("Отказ в добавлении сотрудника %s %s. Больше 10 сотрудников нанять не можем\n", lastName, firstName);
            return;
        }

        // Проверяем нет ли уже такого сотрудника в массиве, если есть то выводим на экран отказ в добавлении сотрудника:
        // дублей у нас быть не может
        for (int i = 0; i < count; i++) {
            if (employees[i].getLastName().equals(lastName) && employees[i].getFirstName().equals(firstName)) {
                System.out.printf("Отказ в добавлении сотрудника %s %s. Такой работник уже трудоустроен \n", lastName, firstName);
                return;
            }
        }


        // Запрашиваем у пользователя отчество, отдел и уровень зарплаты
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Мы можем принять %s %s. Для этого введите его отчество, отдел где он работает, зарплату. После каждого значения нажимайте Enter \n", lastName, firstName);
        String middleName = scanner.nextLine();
        int department = scanner.nextInt();
        int salary = scanner.nextInt();

        // создаем нового сотрудника и добавляем его в массив
        Employee employee = new Employee(firstName, lastName, middleName, department, salary);
        employees[count] = employee;


    }

    public static void PrintCountEmployees() {
        System.out.printf("В данный момент у нас работает %s сотрудников\n", Employee.getCount());
    }


}
