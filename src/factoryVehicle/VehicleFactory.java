package factoryVehicle;
import factoryVehicle.parts.Body;
import factoryVehicle.parts.Engine;
import factoryVehicle.parts.RunningGear;
import factoryVehicle.parts.Weapon;

public interface VehicleFactory {
    Engine createEngine(); //двигатель
    RunningGear createRunningGear(); //ходовая часть
    Body createBody();  //корпус
    Weapon createWeapon(); //вооружение
}
