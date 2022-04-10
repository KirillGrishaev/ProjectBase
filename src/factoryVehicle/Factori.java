package factoryVehicle;
import factoryVehicle.heavyArmoredVehicle.HeavyArmoredVehicleFactory;
import factoryVehicle.heavyArmoredVehicle.Tank;
import factoryVehicle.lightArmoredVehicle.LAV;
import factoryVehicle.lightArmoredVehicle.LightArmoredVehicleFactory;
import java.util.Scanner;
public class Factori {
    public static void createVehicle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите тип техники:?\n" +
                "1.Тяжело-бронированая техника (Танк).\n" +
                "2.Легкобронированная машина (LAV)");
        int choise = sc.nextInt();
        Object factori = null;
        switch (choise) {
            case (1):
                System.out.println("Отличный выбор!");
                factori = HeavyArmoredVehicleFactory.createHAVF();
                Tank tank =((HeavyArmoredVehicleFactory) factori).createTank();
                System.out.println("Управление:\n" +
                        "1. Поехать вперед.\n" +
                        "2. Остановиться.\n" +
                        "3. Пострелять.");
                int choise1 = sc.nextInt();
                switch (choise1) {
                    case (1):
                        tank.drive();
                        break;
                    case (2):
                        tank.stop();
                        break;
                    case (3):
                        tank.fire();
                        break;
                }
                break;
            case (2):
                System.out.println("Отличный выбор!");
                factori = LightArmoredVehicleFactory.createLAVF();
                LAV lAV = ((LightArmoredVehicleFactory) factori).createLAV();
                System.out.println("Управление:\n" +
                        "1. Поехать вперед.\n" +
                        "2. Остановиться.\n" +
                        "3. Пострелять.");
                choise1 = sc.nextInt();
                switch (choise1) {
                    case (1):
                        lAV.drive();
                        break;
                    case (2) :
                        lAV.stop();
                        break;
                    case (3) :
                        lAV.fire();
                        break;
                }
                break;
        }
    }
}