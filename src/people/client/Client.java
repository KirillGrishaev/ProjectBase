package people.client;
import people.base.Chelovek;

import java.util.*;

public class Client extends Chelovek {

    public  Client(String type, String familia ,int vozrast,int dohod, String name, String patronymic, double moneyToABankAccount){
        super(type, familia,vozrast,dohod, name,patronymic,moneyToABankAccount);}
    public List <Client>  getClientBase() {
        List <Client> clientBase = new ArrayList<>();
        clientBase.add(new Client("Клиент", "Иванов",10, 100, "Иван", "Юрьевич",4654));
        clientBase.add(new Client("Клиент", "Сидоров", 10,1123,"Александр", "Олегович",5986));
        clientBase.add(new Client("Клиент", "Петров", 15,5556,"Дмитрий", "Апполосович",55151));
        clientBase.add(new Client("Клиент", "Виткин", 10055,3654,"Тимофей", "Тимофеевич",436457));
        clientBase.add(new Client("Клиент", "Михайлов", 1564,658,"Александр", "Владимирович",453434));
        clientBase.add(new Client("Клиент", "Калёнов", 16,465,"Валерий", "Николаевич",345343));
        clientBase.add(new Client("Клиент", "Усков", 658,465,"Александр", "Сергеевич",345432));
        clientBase.add(new Client("Клиент", "Александров", 6584,658,"Дмитрий", "Олегович",23454));
        clientBase.add(new Client("Клиент", "Чалбаа", 65,984,"Чингиз", "Алексеевич",5435323));
        clientBase.add(new Client("Клиент", "Корбашов", 69,79,"Илья", "Александрович",4523));
        return  clientBase;
}
}


