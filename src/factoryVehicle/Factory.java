package factoryVehicle;
import factoryVehicle.heavyArmoredVehicle.HeavyArmoredVehicleFactory;
import factoryVehicle.lightArmoredVehicle.LightArmoredVehicleFactory;
import factoryVehicle.parts.ModelVehicleFactory;
import java.util.Scanner;
public class Factory  {
    public  ModelVehicleFactory createVehicle(int choise) {
        Scanner sc = new Scanner(System.in);
        Object factori = null;
        ModelVehicleFactory vehicle = null;
       switch (choise) {
            case (1):
                System.out.println("Отличный выбор!");
                factori = HeavyArmoredVehicleFactory.createHAVF();
                vehicle =((HeavyArmoredVehicleFactory) factori).createTank();
                             break;
            case (2):
                System.out.println("Отличный выбор!");
                factori = LightArmoredVehicleFactory.createLAVF();
                vehicle = ((LightArmoredVehicleFactory) factori).createLAV();
                break;
        }
        return vehicle;
      }
    }