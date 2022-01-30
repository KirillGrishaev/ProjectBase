package bank.otdel;

public class OtdelCassa extends OtdelConstruct implements Pay {
    public OtdelCassa(String otdelName, int rabotnik) {
        super(otdelName,rabotnik);
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