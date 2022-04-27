package service;
import java.io.*;
import java.util.Scanner;
public class Read {
    private static final String CATALOG_NAME = "file/";
    public static void read(String fileName) {
        synchronized (fileName) {
            try (BufferedReader br = new BufferedReader(new FileReader(CATALOG_NAME + fileName))) {
                String currentLine = "";
                while ((currentLine = br.readLine()) != null) {
                    System.out.println(currentLine);
                }
                } catch (FileNotFoundException e) {
                System.out.println("Данный каталог техники не найден," + fileName + " повторите поиск по имени каталога: ");
                Scanner sc = new Scanner(System.in);
                fileName = sc.next();
                read(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}