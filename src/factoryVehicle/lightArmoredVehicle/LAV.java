package factoryVehicle.lightArmoredVehicle;

import factoryVehicle.VehicleActions;
import factoryVehicle.parts.*;
import factoryVehicle.parts.Engine;
import factoryVehicle.parts.RunningGear;
import factoryVehicle.parts.Weapon;

public class LAV extends ModelVehicleFactory implements VehicleActions{

    public LAV(Engine engine, Body body, Weapon weapon, RunningGear runningGear) {
    }

    @Override
    public void drive() {
        System.out.println("Газ в пол!");
    }

    @Override
    public void fire() {
        System.out.println("*Бух-бух-бух-бух-бух!");
    }

    @Override
    public void stop() {
        System.out.println("Тормози!Тормози!...\n" +
                "Жалко бабушку....\n" +
                "Тормози!Тормози....\n" +
                "Жалко дедушку...\n" +
                "Вот и остановились.");
    }
}
