package bank.otdel;

public abstract class OtdelConstruct {
    private String otdelName;//название отдела//
    private int rabotnik ;//число сотрудников отдела, сколько клиентов за раз можно обработать//

    public OtdelConstruct(String otdelName,int rabotnik){
        this.otdelName = otdelName;
        this.rabotnik = rabotnik;
    }


    public String getOtdelName() {return otdelName;}
    public void setOtdelName(String otdelName) {this.otdelName = otdelName;}

    public int getRabotnik() {return rabotnik;}
    public void setRabotnik(int rabotnik) {this.rabotnik = rabotnik;}
}
