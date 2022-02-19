package bank;
import people.client.Client;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class Search {

    public Client getClient() {
        Client client = new Client("Клиент", "Иванов", 10,100,"Иван", "Юрьевич", 4654);
        return client; }

        public void searchClient() {
            Client client = getClient();//инициализация Клиента, получение "контейнера" для поиска по коллекции
            List <Client> clientBase = client.getClientBase();//преобразование коллекции List в HashSet для оптимизации времени поиска и исключения повторяющихся элементов

            Scanner console = new Scanner(System.in);//объявление сканнера, источником указаны данные ввода с клавиатуры
            System.out.println("Тип объекта: ");
            String type = console.nextLine();
            System.out.println("Фамилия: ");
            String familia = console.nextLine();
            System.out.println("Имя: ");
            String name = console.nextLine();
            System.out.println("Отчество: ");
            String patronymic = console.nextLine();
            System.out.println("Возраст: ");
            int vozrast = console.nextInt();
            System.out.println("Доход: ");
            int dohod = console.nextInt();
            System.out.println("Денег на счету: ");
            double moneyToABankAccount = console.nextDouble();//поочередно считываем данные искомого Клиента



            client.setDolznost(null);
            client.setType(type);
            client.setFamilia(familia);
            client.setVozrast(vozrast);
            client.setDohod(dohod);
            client.setName(name);
            client.setPatronymic(patronymic);
            client.setMoneyToABankAccount(moneyToABankAccount);// присваиваем параметры искомого клиента введеннные с клавиатуры

            System.out.println(clientBase.contains(client));//поиск клиента в коллекции.

        }

    }
