package Service;
import vehicle.Vehicle;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ConvertVehicle1ToCollect {
    private static final String CATALOG_NAME = "file/";
    public static List<Vehicle> convertRun () {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        List<Vehicle> listOfVehicle = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CATALOG_NAME+fileName))) {
            String currentLine = "";
            while ((currentLine= br.readLine()) != null) {
                if(currentLine!=null && !currentLine.isBlank())
                    listOfVehicle.add(convertStringToVehicle(currentLine));
                            }
            System.out.println(listOfVehicle);
        } catch (FileNotFoundException e) {
            System.out.println("Данный каталог техники не найден," + fileName + " повторите поиск по имени каталога: ");
            convertRun();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfVehicle;
    }
    private static Vehicle convertStringToVehicle (String currentLine) {
        String[] splitted =  currentLine.split(";");
        Vehicle vehicle = new Vehicle();
        for (String s : splitted){
            getTypeAndSet(s,vehicle);
            getNameAndSet(s,vehicle);
            getServiceLifeAndSet(s,vehicle);
            getWeightAndSet(s,vehicle);
            getPriceAndSet(s,vehicle);
        }
        return vehicle;
    }
    private static void getTypeAndSet(String s,  Vehicle p) {   // Тип техники: Грузовик
        if(s!=null && s.contains("Тип техники: ")) {
            p.setType(s.split(": ")[1]);
        }
    }
    private static void getNameAndSet(String s,  Vehicle p) { //Название: Лада-Ларгус
        if(s!=null && s.contains("Название: ")) {
            p.setName(s.split(": ")[1]);
        }
    }
    private static void getServiceLifeAndSet(String s,  Vehicle p) {   // Тип техники: Грузовик
        if(s!=null && s.contains("Срок_службы: ")) {
            p.setServiceLife(s.split(": ")[1]);
        }
    }
    private static void getWeightAndSet(String s,  Vehicle p) {   // Тип техники: Грузовик
        if(s!=null && s.contains("Вес: ")) {
            p.setWeight(s.split(": ")[1]);
        }
    }
    private static void getPriceAndSet(String s,  Vehicle p) {   // Тип техники: Грузовик
        if(s!=null && s.contains("Стоимость: ")) {
            p.setPrice(Integer.valueOf(s.split(": ")[1]));
        }
    }
}