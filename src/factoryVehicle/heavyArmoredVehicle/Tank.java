package factoryVehicle.heavyArmoredVehicle;
import factoryVehicle.VehicleActions;
import factoryVehicle.parts.*;

public class Tank extends ModelVehicleFactory  implements VehicleActions{
    public Tank(Engine engine, Body body, Weapon weapon, RunningGear runningGear) {
    }

    @Override
    public void drive() {
        System.out.println("И танки с колоссальным скрипом\n" +
                "Сметают мирные заборы.");
    }

    @Override
    public void fire() {
        System.out.println("*Буууууууух!*");
    }

    @Override
    public void stop() {
        System.out.println("Мы двинемся следом, как только подвезут горючее.");
    }
}
