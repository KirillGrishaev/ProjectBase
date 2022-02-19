package people.client;
import people.base.Chelovek;

import java.util.*;

public class Client extends Chelovek {

    public  Client(String type, String familia ,  String name, String patronymic, double moneyToABankAccount){
        super(type, familia,name,patronymic,moneyToABankAccount);}
    public List <Client>  getClientBase() {
        List <Client> clientBase = new ArrayList<>();
        clientBase.add(new Client("Клиент", "Иванов", "Иван", "Юрьевич",4654));
        clientBase.add(new Client("Клиент", "Сидоров", "Александр", "Олегович",5986));
        clientBase.add(new Client("Клиент", "Петров", "Дмитрий", "Апполосович",55151));
        clientBase.add(new Client("Клиент", "Виткин", "Тимофей", "Тимофеевич",436457));
        clientBase.add(new Client("Клиент", "Михайлов", "Александр", "Владимирович",453434));
        clientBase.add(new Client("Клиент", "Калёнов", "Валерий", "Николаевич",345343));
        clientBase.add(new Client("Клиент", "Усков", "Александр", "Сергеевич",345432));
        clientBase.add(new Client("Клиент", "Александров", "Дмитрий", "Олегович",23454));
        clientBase.add(new Client("Клиент", "Чалбаа", "Чингиз", "Алексеевич",5435323));
        clientBase.add(new Client("Клиент", "Корбашов", "Илья", "Александрович",4523));
        return  clientBase;
}
}


