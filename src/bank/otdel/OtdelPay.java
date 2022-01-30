package bank.otdel;

public class OtdelPay extends OtdelConstruct implements Pay {
    public OtdelPay(String otdelName, int rabotnik) {
        super(otdelName, rabotnik);
    }

    @Override
    public int getMoney() {
        return 0;
    }

    @Override
    public int setMoney() {
        return 0;
    }
}