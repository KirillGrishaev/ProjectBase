package people.base;

import java.util.Objects;
import java.util.Random;

public abstract class Chelovek{
    private String type;//определение индивида как Клиента или Сотрудника
    private String familia;
    private int vozrast;
    private int dohod;
    private String dolznost;
    private String name;
    private String patronymic;
    private double moneyToABankAccount;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chelovek)) return false;
        Chelovek chelovek = (Chelovek) o;
        return Double.compare(chelovek.moneyToABankAccount, moneyToABankAccount) == 0 && type.equals(chelovek.type) && familia.equals(chelovek.familia) && name.equals(chelovek.name) && patronymic.equals(chelovek.patronymic);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, familia, name, patronymic, moneyToABankAccount);
    }

    public  Chelovek(String type, String familia, String name, String patronymic, double moneyToABankAccount){//конструктор для создания people.base.Chelovek типа Client (Клиент назван Гостем)
        this.familia = familia;
        this.vozrast = generateRandomIntVozrast ();
        this.dohod = generateRandomIntDohod(9000,1000000);
        this.name = name;
        this.patronymic = patronymic;
        this.type = type;
        this.moneyToABankAccount = moneyToABankAccount;
    }

    public Chelovek(String type, String dolznost, String familia , String name, String patronymic){//конструктор для создания people.base.Chelovek типа Sotrundnik
        this.dolznost = dolznost;
        this.type = getType();
        this.familia = familia;
        this.name = name;
        this.patronymic = patronymic;
    }

    public int generateRandomIntVozrast (){
        Random rnd = new Random();
        return rnd.nextInt(65)+1;  }

    public int generateRandomIntDohod (int min, int max){
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min; }

    public String getFamilia() {return familia; }
    public void setFamilia(String familia) {this.familia = familia; }

    public String getName() {return name;}
    public void setName(String name) {this.name = name; }

    public String getPatronymic() {return patronymic; }
    public void setPatronymic(String patronymic) { this.patronymic = patronymic;    }

    public String getType() { return type; }
    public void setType(String type) {
        this.type = type;
    }

    public int getVozrast() {
        return vozrast;
    }
    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    public  int getDohod() {
        return dohod;
    }
    public void setDohod(int dohod) {
        this.dohod = dohod;
    }

    public String getDolznost() {
        return dolznost;
    }

    public void setDolznost(String dolznost) {
        this.dolznost = dolznost;
    }
    public int getMoneyToABankAccount() {
        return (int) moneyToABankAccount;
    }

    public void setMoneyToABankAccount(double moneyToABankAccount) {
        this.moneyToABankAccount = moneyToABankAccount;    }
    }