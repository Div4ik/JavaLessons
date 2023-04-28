package lesson13StreamField;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("\"O:\\java\\java4Free\\text.txt");
        Scanner scannerFile = new Scanner(file);
        while(scannerFile.hasNextLine()){
            System.out.println(scannerFile.nextLine());
        }
    }

}
