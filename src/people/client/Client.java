package people.client;

import people.base.Chelovek;
import java.util.Arrays;
public class Client extends Chelovek {
    public Client(String type,String familia , String name, String patronymic){
        super(type, familia,name,patronymic);}

    public Client[] getClientBaseArray() {
        Client [] clientBaseArray = new Client[10];
                clientBaseArray[0] = new Client("Клиент", "Иванов", "Иван", "Юрьевич");
                clientBaseArray[1] = new Client("Клиент", "Сидоров", "Александр", "Олегович");
                clientBaseArray[2] = new Client("Клиент", "Петров", "Дмитрий", "Апполосович");
                clientBaseArray[3] = new Client("Клиент", "Виткин", "Тимофей", "Тимофеевич");
                clientBaseArray[4] = new Client("Клиент", "Михайлов", "Александр", "Владимирович");
                clientBaseArray[5] = new Client("Клиент", "Калёнов", "Валерий", "Николаевич");
                clientBaseArray[6] = new Client("Клиент", "Усков", "Александр", "Сергеевич");
                clientBaseArray[7] = new Client("Клиент", "Александров", "Дмитрий", "Олегович");
                clientBaseArray[8] = new Client("Клиент", "Чалбаа", "Чингиз", "Алексеевич");
                clientBaseArray[9] = new Client("Клиент", "Корбашов", "Илья", "Александрович");
        return clientBaseArray;
    }
}


