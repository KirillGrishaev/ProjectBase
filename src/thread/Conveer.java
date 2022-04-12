package thread;

public class Conveer extends Thread {

    public Conveer(String threadName) {
        super( threadName);
    }

    public void run() {
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName() + "Готов вкалывать...");
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){
        System.out.println("Что, морпехи кончились?!");
        }
        System.out.println(Thread.currentThread().getName() + "Дело сделано.");
    }
}