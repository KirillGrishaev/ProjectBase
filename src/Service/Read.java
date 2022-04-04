package Service;
import fileApp.FileApp;

import java.io.*;
import java.util.Scanner;
public class Read {
    private static final String CATALOG_NAME = "file/";
    public static void read (Scanner sc) {
        String fileName = sc.next();
        try (BufferedReader br = new BufferedReader(new FileReader(CATALOG_NAME+fileName))) {
            String currentLine = "";
            while ((currentLine= br.readLine()) != null) {
                System.out.println(currentLine);
            }
            FileApp.main(null);
        } catch (FileNotFoundException e) {
            System.out.println("Данный каталог техники не найден," + fileName + " повторите поиск по имени каталога: ");
            read(sc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}