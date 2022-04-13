package factoryVehicle;
import factoryVehicle.heavyArmoredVehicle.HeavyArmoredVehicleFactory;
import factoryVehicle.lightArmoredVehicle.LightArmoredVehicleFactory;
import factoryVehicle.parts.ModelVehicleFactory;

import java.util.Scanner;
public class Factory  {
    public  ModelVehicleFactory createVehicle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите тип техники:?\n" +
                "1.Тяжело-бронированая техника (Танк).\n" +
                "2.Легкобронированная машина (LAV)");
        int choise = sc.nextInt();
        Object factori = null;
        ModelVehicleFactory vehicle = null;
       switch (choise) {
            case (1):
                System.out.println("Отличный выбор!");
                factori = HeavyArmoredVehicleFactory.createHAVF();
                vehicle =((HeavyArmoredVehicleFactory) factori).createTank();
                System.out.println("Управление:\n" +
                        "1. Поехать вперед.\n" +
                        "2. Остановиться.\n" +
                        "3. Пострелять.");
                int choise1 = sc.nextInt();
                switch (choise1) {
                    case (1):
                        vehicle.drive();
                        break;
                    case (2):
                        vehicle.stop();
                        break;
                    case (3):
                        vehicle.fire();
                        break;
                }
                break;
            case (2):
                System.out.println("Отличный выбор!");
                factori = LightArmoredVehicleFactory.createLAVF();
                vehicle = ((LightArmoredVehicleFactory) factori).createLAV();
                System.out.println("Управление:\n" +
                        "1. Поехать вперед.\n" +
                        "2. Остановиться.\n" +
                        "3. Пострелять.");

                choise1 = sc.nextInt();
                switch (choise1) {
                    case (1):
                        vehicle.drive();
                        break;
                    case (2) :
                        vehicle.stop();
                        break;
                    case (3) :
                        vehicle.fire();
                        break;
                }
                break;
        }
        return vehicle;
      }
    }