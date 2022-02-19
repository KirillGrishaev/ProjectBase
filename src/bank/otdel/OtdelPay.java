package bank.otdel;

import people.client.Client;

public class OtdelPay extends OtdelConstruct implements Pay {

    public Client getClient() {
        Client client = new Client("Клиент","1",1,7,"1","1",123);
        return client;
    }

    public OtdelPay(String otdelName, int rabotnik) {
        super(otdelName, rabotnik);
    }

    @Override
    public double getMoney() {
        Client client = getClient();
        double moneyToABankAccount = client.getMoneyToABankAccount();
        moneyToABankAccount = moneyToABankAccount - 50;
        client.setMoneyToABankAccount(moneyToABankAccount);
        return moneyToABankAccount;
    }

    @Override
    public double setMoney() {
        Client client = getClient();
        double moneyToABankAccount = client.getMoneyToABankAccount();
        moneyToABankAccount = moneyToABankAccount + 50;
        client.setMoneyToABankAccount(moneyToABankAccount);
        return moneyToABankAccount;
    }
}