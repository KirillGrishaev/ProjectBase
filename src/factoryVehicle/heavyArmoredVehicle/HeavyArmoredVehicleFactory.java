package factoryVehicle.heavyArmoredVehicle;
import factoryVehicle.VehicleFactory;
import factoryVehicle.parts.Body;
import factoryVehicle.parts.Engine;
import factoryVehicle.parts.RunningGear;
import factoryVehicle.parts.Weapon;

public class HeavyArmoredVehicleFactory implements VehicleFactory {

    public static HeavyArmoredVehicleFactory createHAVF(){
        HeavyArmoredVehicleFactory factori = new HeavyArmoredVehicleFactory();
        return factori;
    }
    @Override
    public Engine createEngine() {
        Engine tankEngine = new Engine("Установлен: тяжелый дизельный двигатель.");
        System.out.println("Установлен: тяжелый дизельный двигатель.");
        return tankEngine;
    }

    @Override
    public RunningGear createRunningGear() {
        RunningGear tankRunningGear = new RunningGear("Установлено: гусеничное шасси.");
        System.out.println("Установлено: гусеничное шасси.");
        return tankRunningGear;
    }

    @Override
    public Body createBody() {
        Body tankBody = new Body("Установлено: тяжелобронированный корпус.");
        System.out.println("Установлено: тяжелобронированный корпус.");
        return tankBody;
    }

    @Override
    public Weapon createWeapon() {
        Weapon tankWeapon = new Weapon("Установлено: 122-мм пушка.");
        System.out.println("Установлено: 122-мм пушка.");
        return tankWeapon;
    }
    public Tank createTank(){
        HeavyArmoredVehicleFactory factory = HeavyArmoredVehicleFactory.createHAVF();
        Tank tank = new Tank(factory.createEngine(),factory.createBody(),factory.createWeapon(),factory.createRunningGear());
        System.out.println("Танк создан и готов к работе.");
        return tank;
    }
}
