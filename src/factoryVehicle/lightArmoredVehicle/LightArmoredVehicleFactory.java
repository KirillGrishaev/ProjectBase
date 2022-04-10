package factoryVehicle.lightArmoredVehicle;
import factoryVehicle.VehicleFactory;
import factoryVehicle.parts.Body;
import factoryVehicle.parts.Engine;
import factoryVehicle.parts.RunningGear;
import factoryVehicle.parts.Weapon;
public class LightArmoredVehicleFactory implements VehicleFactory {

    public static LightArmoredVehicleFactory createLAVF(){
     LightArmoredVehicleFactory factori = new LightArmoredVehicleFactory();
     return factori;
    }
    @Override
    public Engine createEngine() {
        Engine lAVEngine = new Engine("Установлен: легкий бензиновый двигатель.");
        System.out.println("Установлен: легкий бензиновый двигатель.");
        return lAVEngine;
    }

    @Override
    public RunningGear createRunningGear() {
        RunningGear lAVRunningGear = new RunningGear("Установлено: легкоё колесное шасси.");
        System.out.println("Установлено: легкоё колесное шасси.");
        return lAVRunningGear;
    }

    @Override
    public Body createBody() {
        Body lAVBody = new Body("Установлено: легкобронированный корпус.");
        System.out.println("Установлено: легкобронированный корпус.");
        return lAVBody;
    }

    @Override
    public Weapon createWeapon() {
        Weapon lAVWeapon = new Weapon("Установлено: автоматическая пушка.");
        System.out.println("Установлено: автоматическая пушка.");
        return lAVWeapon;
    }
    public LAV createLAV() {
        LightArmoredVehicleFactory factory = LightArmoredVehicleFactory.createLAVF();
        LAV lAV = new LAV(factory.createEngine(),factory.createBody(),factory.createWeapon(),factory.createRunningGear());
        System.out.println("LAV создана и готова к работе.");
        return lAV;
    }
}