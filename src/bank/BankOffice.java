package bank;
import bank.Bank;
import bank.otdel.OtdelCredit;
import people.client.Client;
public class BankOffice extends Bank {

    private OtdelCredit otdelCredit;


    public BankOffice(String name,String adress,String typeOffice) {
        super(name,adress,typeOffice);//Конструктор для создания офиса//
        otdelCredit = new OtdelCredit("Отдел Кредитования",1);
    }


    public OtdelCredit getOtdelCredit() { return otdelCredit; }
    public void setOtdelCredit(OtdelCredit otdelCredit) {this.otdelCredit = otdelCredit;}
}
