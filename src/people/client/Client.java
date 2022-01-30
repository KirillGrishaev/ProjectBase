package people.client;
import people.base.Chelovek;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class Client extends Chelovek {

    public  Client(String type, String familia , String name, String patronymic){
        super(type, familia,name,patronymic);}

    public List <Client>  getClientBase() {
        List <Client> clientBase = new ArrayList<>();
        clientBase.add(new Client("Клиент", "Иванов", "Иван", "Юрьевич"));
        clientBase.add(new Client("Клиент", "Сидоров", "Александр", "Олегович"));
        clientBase.add(new Client("Клиент", "Петров", "Дмитрий", "Апполосович"));
        clientBase.add(new Client("Клиент", "Виткин", "Тимофей", "Тимофеевич"));
        clientBase.add(new Client("Клиент", "Михайлов", "Александр", "Владимирович"));
        clientBase.add(new Client("Клиент", "Калёнов", "Валерий", "Николаевич"));
        clientBase.add(new Client("Клиент", "Усков", "Александр", "Сергеевич"));
        clientBase.add(new Client("Клиент", "Александров", "Дмитрий", "Олегович"));
        clientBase.add(new Client("Клиент", "Чалбаа", "Чингиз", "Алексеевич"));
        clientBase.add(new Client("Клиент", "Корбашов", "Илья", "Александрович"));
        return  new ArrayList<>(clientBase);
}
}


