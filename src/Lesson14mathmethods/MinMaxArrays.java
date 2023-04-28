package Lesson14mathmethods;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArrays {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text");
        Scanner scanner = new Scanner(file);
        int[] numbers = new int[15];
        int i = 0;
        while (scanner.hasNextInt()) {
            numbers[i] = scanner.nextInt();
            i++;
        }

        System.out.println(Arrays.toString(numbers));
//        String s = scanner.nextLine();
//        scanner.close();
//
//        System.out.println(s);
//        String[] numbersString = s.split(" ");
//        System.out.println(Arrays.toString(numbersString));
//
//        int[] numbers = new int[numbersString.length];
//        for (int i = 0; i < numbersString.length; i++) {
//            numbers[i] = Integer.parseInt(numbersString[i]);
//        }
//
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));




    }
}
