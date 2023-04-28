package Lesson14mathmethods;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("Корень числа %d = %.2f\n", a, Math.sqrt(a));
        System.out.printf("Корень числа %d = %.2f\n", b, Math.sqrt(b));
        scanner.close();
    }
}
