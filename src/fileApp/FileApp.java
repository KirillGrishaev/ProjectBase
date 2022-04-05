package fileApp;
import Service.*;
import exeption.OutOfLenght;
import java.util.Scanner;
public class FileApp {
    public static void main(String[] args){
        try {
            System.out.println("Инициализация...У нас вы можете: \n" + "1. Ознакомиться с каталогом;\n" + "2. Приобрести технику в количестве до 10 штук;\n" +
                    "3. Стать поставщиком (добавить свои позиции в базу данных;\n" + "4. Отправиться в Рейд;\n" +
                    "5. Уволить системного администратора;\n" + "Любое другое число >5 для выхода.");
            Scanner sc = new Scanner(System.in);
            int choise = sc.nextInt();
            switch (choise) {
                case (1):
                    System.out.println("Укажите каталог имя каталога:");
                    Read.read(sc);
                    break;
                case (2):
                    System.out.println("Укажите название каталога.");
                    Buy.buy(sc);
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
                default:
                    System.out.println("Иди консервных банок пособирай.");
                    break;
            }
        }catch (OutOfLenght e){
            System.out.println("Сказали же не больше 10 у.е. в одни руки!*Вас выбросили в холл*");
        }
    }
}