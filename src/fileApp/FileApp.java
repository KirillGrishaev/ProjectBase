package fileApp;
import data.*;
import vehicle.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FileApp {

    public static void main(String[] args) {
        System.out.println("Инициализация...У нас вы можете: ");
        System.out.println("1. Ознакомиться с каталогом;");
        System.out.println("2. Приобрести технику в количестве до 10 штук;");
        System.out.println("3. Стать поставщиком (добавить свои позиции в базу данных;");
        System.out.println("4. Отправиться в Рейд;");
        System.out.println("5. Уволить системного администратора;");

        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();

        if (choise == 1) {
            System.out.println("Укажите каталог имя каталога:");
            Read.read(sc);
        } else if (choise == 2) {
            Buy buy = new Buy();
        } else if (choise == 3) {
            System.out.println("1. Укажите имя каталога (либо задайте новый).\n" +
                    "2.Без пробелов последовательно добавьте описание своей позиции формата, нажимая Enter после каждого параметра\n" +
                    "Тип техники; Название; Срок службы (например \"7_лет\"); Вес (например \"50_тонн\"); Стоимость;\n" +
                    "*Комиссия нашей площадки жалкие 99%.\n" +
                    "**За некорректный ввод отправляем в угольные шахты.");
            Write.write(sc);
        } else if (choise == 4) {
            System.out.println("Мир темного фентези Raid: Shadow Legends  ждет вас! Ищитем меня в Рейде!");
        } else {
            System.out.println("Чё, самый умный что ли?! *Жизнь великого Рейнджера закончилась*");
        }
    }
}
