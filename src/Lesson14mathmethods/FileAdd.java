package Lesson14mathmethods;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileAdd {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Строка новая");
        printWriter.println("Еще одна");
        printWriter.close();
    //    File file2 = null;
    //    file2.createNewFile("Text2.txt");

    }
}
