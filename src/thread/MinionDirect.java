package thread;
import fileApp.FileApp;
import thread.tasks.BuyMinion;
import thread.tasks.FactoryMinion;
import thread.tasks.ReadMinion;

import java.util.Scanner;
public class MinionDirect {
    boolean by;
    public void minionDirect() {
        by = true;
        while (by) {
            System.out.println("Отправить миньона:\n" +
                    "1. За каталогом;\n" +
                    "2. В отдел закупок;\n" +
                    "3. На фабрику;\n" +
                    "4. Для выхода.");
            Scanner sc = new Scanner(System.in);
            int choise = sc.nextInt();
            switch (choise) {
                case (1):
                    System.out.println("Мока.Укажите название каталога.");
                    new Thread(new ReadMinion()).start();
                    break;
                case (2):
                    System.out.println("Мока.Укажите название каталога.");
                    new Thread(new BuyMinion()).start();
                    break;
                case (3):
                    System.out.println("Мока.\n" +
                            "Ну давай что-нибудь соберем.");
                    new Thread(new FactoryMinion()).start();
                    break;
                case (4):
                  by = false;
                    break;
            }
        }
        FileApp.main(null);
    }
}