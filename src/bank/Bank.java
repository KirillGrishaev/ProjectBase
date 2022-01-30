package bank;
import bank.otdel.OtdelCredit;
import bank.otdel.OtdelCassa;
import bank.otdel.OtdelPay;
import bank.otdel.Pay;

public class Bank {//Для отображения общих параметров банка в целом, будь то приостановление действия лицензии, или закрытия//
    private String name;//название банка//
    private String license;//лицензия есть или нет//
    private String typeOffice;
    private String adress;
    private BankOffice bankOffice;

   public Bank (String name,String license){
        this.name = name;
        this.license = license;

    }
    public Bank(String name, String adress,String typeOffice) {//расширенный конструктор для Офиса
       this.name=getName();
       this.adress = adress;
       this.typeOffice=typeOffice;
    }
    public static void main(String[] args){
    Bank kidok = new Bank("Кидала Банк",
                          "Какая лицензия?!");
    BankOffice bankOffice = new BankOffice(kidok.getName(),
                                          "Три девятое царство, г. Урюпинск, улица Щипачей,д.13",
                                          "Кидаем круглосуточно!");
    OtdelCredit otdelCredit = bankOffice.getOtdelCredit();
    otdelCredit.vidatCredit();
    Pay otdelCassa = bankOffice.getOtdelCassa();
    Pay otdelPay = bankOffice.getOtdelPay();
    otdelCassa.getMoney();
    otdelPay.getMoney();
    }

    public String getName() {return name;}
    public void setName(String name) { this.name = name;}
    public String getLicense() {return license;}
    public void setLicense(String license) {this.license = license;}
    public String getTypeOffice() {return typeOffice;}
    public void setTypeOffice(String typeOffice) {this.typeOffice = typeOffice;}
    public String getAdress() {return adress;}
    public void setAdress(String adress) {this.adress = adress;}
    public BankOffice getBankOffice() {return bankOffice;}
    public void setBankOffice(BankOffice bankOffice) { this.bankOffice = bankOffice;}
}
