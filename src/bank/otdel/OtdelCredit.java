package bank.otdel;
import bank.Bank;
import bank.BankOffice;
import uslugi.Credit;
import people.sotrudnik.Sotrudnik;
import people.client.Client;
import java.util.List;

public class OtdelCredit extends OtdelConstruct {
    private Sotrudnik specialist;

    public OtdelCredit(String otedelName, int rabotnik) {//Конструктор для Отдела Кредитов//
        super(otedelName,rabotnik);
        specialist = new Sotrudnik("Сотрудник","Консультант отдела кредитования","Иванов","Иван","Иванович");
    }
    public void vidatCredit() {
        Client A = new Client ("Клиент","1","1","1",123);//инициализация класса Client
        List <Client> clientBase =  A.getClientBase();
        Sotrudnik specialist = getSpecialist();
           for (int i=0;i< clientBase.size(); i++){
            Credit credit = new Credit(1, 1);
            int dohod = clientBase.get(i).getDohod();
            int vozrast = clientBase.get(i).getVozrast();
            if (10000 >= dohod ){
                System.out.println("Клиент "+(i+1)+"  "+dohod+"  "+vozrast);
                System.out.println("Сотрудник "+specialist.getFamilia()+" "+specialist.getName()+" "+specialist.getPatronymic()+" отказал в кредите");
                                }
            else{
                if (dohod >= 100000){
                credit.setProcent(5);
            }
            else {
                credit.setProcent(10);
            }
            }
                if (18>=vozrast){
                    System.out.println("Клиент "+(i+1)+"  "+dohod+"  "+vozrast);
                    System.out.println("Сотрудник "+specialist.getFamilia()+" "+specialist.getName()+" "+specialist.getPatronymic()+" отказал в кредите");
                }
                else{
                    if (vozrast<=30){
                        credit.setTime(10);
                        System.out.println("Клиент "+(i+1)+"  "+dohod+"  "+vozrast);
                        System.out.println("Срок кредита: "+credit.getTime()+" лет");//Вывод на экран параметров Кредита//
                        System.out.println("Процентная ставка: "+credit.getProcent()+" %");//Вывод на экран параметров Кредита
                    }
                    else{
                        credit.setTime(5);
                        System.out.println("Клиент "+(i+1)+"  "+dohod+"  "+vozrast);
                        System.out.println("Срок кредита: "+credit.getTime()+" лет");//Вывод на экран параметров Кредита//
                        System.out.println("Процентная ставка: "+credit.getProcent()+" %");//Вывод на экран параметров Кредита
                    }
                    }
        }
    }
    public Sotrudnik getSpecialist() {return specialist;}
    public void setSpecialist(Sotrudnik specialist) { this.specialist = specialist; }
}