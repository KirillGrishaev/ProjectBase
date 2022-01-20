package bank.otdel;
import uslugi.Credit;
import people.sotrudnik.Sotrudnik;
import people.client.Client;

public class OtdelCredit extends OtdelConstruct {
    private Sotrudnik specialist;

    public OtdelCredit(String otedelName, int rabotnik) {//Конструктор для Отдела Кредитов//
        super(otedelName,rabotnik);
        specialist = new Sotrudnik("Сотрудник","Консультант отдела кредитования","Иванов","Иван","Иванович");
    }

    public void vidatCredit() {
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
                Sotrudnik specialist = getSpecialist();
           for (int i=0; i<clientBaseArray.length; i++){
            Credit credit = new Credit(1, 1);
            int dohod = clientBaseArray[i].getDohod();
            int vozrast = clientBaseArray[i].getVozrast();
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