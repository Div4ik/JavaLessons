package lesson13StreamField.Employers;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        Employee jhony = new Employee(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt(),scanner.nextDouble(), scanner.nextInt());
        System.out.println("jhony = " + jhony);
    }
}
