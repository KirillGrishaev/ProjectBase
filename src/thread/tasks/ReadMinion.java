package thread.tasks;
import service.Read;

public class ReadMinion implements Runnable {
       public void run(){
        try {
        String fileName ="Vehicle.txt";
        System.out.println("*Миньон-секретарь* Уже бегу!!!");
        Thread.sleep(5000);
        Read.read(fileName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
