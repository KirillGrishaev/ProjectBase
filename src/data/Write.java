package data;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Write {
    private static final String CATALOG_NAME = ".idea/file/";
    public static void write() {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        try (BufferedWriter fw = new BufferedWriter(new FileWriter(CATALOG_NAME + fileName, true))) {
            fw.write("\n");
            fw.write("Тип техники: " + sc.next() + ";"+"Название: " + sc.next() + ";"+"Срок_службы: " + sc.next() + ";"
                         +"Вес: " + sc.next() + ";"+"Стоимость: " + sc.nextInt() + ";");
            /*fw.write("Название: " + sc.next() + ";");
            fw.write("Срок_службы: " + sc.next() + ";");
            fw.write("Вес: " + sc.next() + ";");
            fw.write("Стоимость: " + sc.nextInt() + ";");*/
        } catch (FileNotFoundException e) {
            System.out.println("Данный каталог техники не найден," + fileName + " повторите поиск по имени каталога:");
            write();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
            System.out.println("Еще раз и в шахты!* Злой админ идет удалять последнюю строку в файле*");
            write();
        }
    }
}
