package data;
import java.io.*;
import java.util.Scanner;
import vehicle.*;
import java.util.ArrayList;
import java.util.List;
public class Read {
    private static final String CATALOG_NAME = ".idea/file/";
    public static void read (Scanner sc) {
        String fileName = sc.next();
        try (BufferedReader br = new BufferedReader(new FileReader(CATALOG_NAME+fileName))) {
            String currentLine = "";
            while ((currentLine= br.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Данный каталог техники не найден," + fileName + " повторите поиск по имени каталога: ");
            read(sc);
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}