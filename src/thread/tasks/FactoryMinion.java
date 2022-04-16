package thread.tasks;
import factoryVehicle.Factory;

public class FactoryMinion implements Runnable {
    public void run() {
        try {
            System.out.println("*Миньон-фабрикатор* Уже бегу!!!");
            Thread.sleep(5000);
            int choise = 1;
            Factory factory = new Factory();
            factory.createVehicle(choise);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
