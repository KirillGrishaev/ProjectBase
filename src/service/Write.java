package service;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Write {
    private static final String CATALOG_NAME = "file/";
    public static void write() {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        try (BufferedWriter fw = new BufferedWriter(new FileWriter(CATALOG_NAME + fileName, true))) {
           fw.write("\nТип техники: " + sc.next() + ";"+"Название: " + sc.next() + ";"+"Срок_службы: "
                   + sc.next() + ";" +"Вес: " + sc.next() + ";"+"Стоимость: " + sc.nextInt() + ";");
        } catch (FileNotFoundException e) {
            System.out.println("Данный каталог техники не найден," + fileName + " повторите поиск по имени каталога:");
            write();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
            System.out.println("Еще раз и в шахты!");
            write();
        }
    }
}