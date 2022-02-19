package bank;
import bank.otdel.OtdelCredit;
import bank.otdel.OtdelCassa;
import bank.otdel.OtdelPay;
import people.sotrudnik.Sotrudnik;

public class BankOffice extends Bank {
    private OtdelCredit otdelCredit;
    private OtdelPay otdelPay;
    private OtdelCassa otdelCassa;
    private Sotrudnik specialistCash;
    private Sotrudnik specialistPay;
    private int i=0;
    private int b=0;

    public BankOffice(String name,String adress,String typeOffice) {
        super(name,adress,typeOffice);//Конструктор для создания офиса//
        otdelCredit = new OtdelCredit("Отдел Кредитования",1);
    }
    public OtdelCassa getOtdelCassa (){
        if (i == 0){
            otdelCassa = new OtdelCassa("Касса",1);
            specialistCash = new Sotrudnik("Сотрудник","Кассир","Волкова","Галина","Абрамовна");
            i = i+1;
            return otdelCassa;}
        else {
            return otdelCassa;}
    }

    public OtdelPay getOtdelPay (){
        if (b==0){
        otdelPay = new OtdelPay("Отдел оплаты",1);
        specialistPay = new Sotrudnik("Сотрудник","Консультант отдела оплаты","Новосельцев","Ибрагим","Апполосович");
        b = b+1;
        return otdelPay;}
        else {
            return otdelPay;}
    }


    public OtdelCredit getOtdelCredit() { return otdelCredit; }
    public void setOtdelCredit(OtdelCredit otdelCredit) {this.otdelCredit = otdelCredit;}
}
