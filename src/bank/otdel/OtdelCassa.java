package bank.otdel;

import people.client.Client;

public class OtdelCassa extends OtdelConstruct implements Pay {

    private Client client;

    public Client getClient() {
        Client client = new Client("Клиент","1",65,15,"1","1",123);
        return client;
    }

    public OtdelCassa(String otdelName, int rabotnik) {
        super(otdelName,rabotnik);
    }

    @Override
    public double getMoney() {
        Client client = getClient();
        double moneyToABankAccount = client.getMoneyToABankAccount();
        moneyToABankAccount = (moneyToABankAccount - (50+(50/10)));//комиссия 10% за операцию.
        client.setMoneyToABankAccount(moneyToABankAccount);
        System.out.println("****"+client.getMoneyToABankAccount()+"*****");
        return moneyToABankAccount;
    }

    @Override
    public double setMoney() {
        Client client = getClient();
        double moneyToABankAccount = client.getMoneyToABankAccount();
        moneyToABankAccount = moneyToABankAccount + (50-(50/10));//комиссия 10% за операцию.
        client.setMoneyToABankAccount(moneyToABankAccount);
        return moneyToABankAccount;
    }
}