package thread.tasks;
import exeption.OutOfLenght;
import service.Buy;
public class BuyMinion implements Runnable {
    public void run(){
        try {
            String fileName ="Vehicle.txt";
            System.out.println("*Миньон-закупщик* Уже бегу!!!");
            Thread.sleep(5000);
            int position = 1;
            int count = 3;
            Buy.buy(fileName,position,count);
        } catch (OutOfLenght | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
