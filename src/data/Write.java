package data;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Write {
    private static final String CATALOG_NAME = ".idea/file/";
    public static void write(Scanner sc) {
        String fileName = sc.next();
        try (FileWriter fw = new FileWriter(CATALOG_NAME + fileName, true)) {
            fw.write("\n");
            fw.write("Тип техники: " + sc.next() + ";");
            fw.write("Название: " + sc.next() + ";");
            fw.write("Срок_службы: " + sc.next() + ";");
            fw.write("Вес: " + sc.next() + ";");
            fw.write("Стоимость: " + sc.nextInt() + ";");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
            System.out.println("Еще раз и в шахты!* Злой админ идет удалять последнюю строку в файле*");
            write(sc);
        }
    }
}
