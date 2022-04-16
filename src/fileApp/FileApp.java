package fileApp;
import service.*;
import exeption.OutOfLenght;
import factoryVehicle.Factory;
import thread.MinionDirect;
import java.util.Scanner;
public class FileApp {

    public static void main(String[] args) {
        System.out.println("Инициализация...У нас вы можете: \n" +
                "1. Ознакомиться с каталогом;\n" +
                "2. Приобрести технику в количестве до 10 штук;\n" +
                "3. Стать поставщиком (добавить свои позиции в базу данных;\n" +
                "4. Отправиться в Рейд;\n" +
                "5. Уволить системного администратора;\n" +
                "6. Запустить производство;\n"+
                "7. Вызвать миньонов;\n"+
                "Любое другое число >7 для выхода.");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        try {switch (choise) {
                case (1):
                    System.out.println("Укажите каталог имя каталога:");
                    String fileName = sc.next();
                    Read.read(fileName);
                    break;
                case (2):
                    System.out.println("Укажите название каталога.");
                    fileName = sc.next();
                    System.out.println("Выберите интересующую позицию (отсчет идет с 0): ");
                    int position = Integer.parseInt(sc.next());
                    System.out.println("Выберите количество товара (до 10 у.е.):");
                    int count = Integer.parseInt(sc.next());
                    Buy.buy(fileName,position,count);
                    break;
                case (3):
                    System.out.println("1. Укажите название каталога (либо задайте новый).\n" +
                            "2.Без пробелов последовательно добавьте описание своей позиции формата, нажимая Enter после каждого параметра\n" +
                            "Тип техники; Название; Срок службы (например \"7_лет\"); Вес (например \"50_тонн\"); Стоимость;\n" +
                            "*Комиссия нашей площадки жалкие 99%.\n" +
                            "**За некорректный ввод отправляем в угольные шахты.");
                    Write.write();
                case (4):
                    System.out.println("Мир темного фентези Raid: Shadow Legends  ждет вас! Ищитем меня в Рейде!");
                    break;
                case (5):
                    System.out.println("Чё, самый умный что ли?! *Жизнь великого Рейнджера закончилась*");
                    break;
                case (6):
                System.out.println("Ну давай что-нибудь соберем.");
                    System.out.println("Выберите тип техники:?\n" +
                            "1.Тяжело-бронированая техника (Танк).\n" +
                            "2.Легкобронированная машина (LAV)");
                    choise = sc.nextInt();
                Factory factory = new Factory();
                factory.createVehicle(choise);
                break;
                case (7):
                System.out.println("Белло!");
                MinionDirect mainMinion = new MinionDirect();
                mainMinion.minionDirect();
                break;
                default:
                    System.out.println("Иди консервных банок пособирай.");
                    break;
            }
        } catch (OutOfLenght e) {
            System.out.println("Сказали же не больше 10 у.е. в одни руки!*Вас выбросили в холл*");
        }
    }
}