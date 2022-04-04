package data;

import vehicle.Vehicle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buy {

    public Buy(){

    }
    private static final String CATALOG_NAME = ".idea/file/";
    public static void read (Scanner sc) {
        String fileName = sc.next();
        try (BufferedReader br = new BufferedReader(new FileReader(CATALOG_NAME+fileName))) {
            List<Vehicle> listOfVehicle = new ArrayList<>();
            String currentLine = "";
            while ((currentLine= br.readLine()) != null) {
                System.out.println(currentLine);
                if(currentLine!=null && !currentLine.isBlank())
                    listOfVehicle.add(convertStringToVehicle(currentLine));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Данный каталог техники не найден," + fileName + " повторите поиск по имени каталога: ");
            read(sc);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
