package uslugi;
public class Credit {
    private int procent; //процентная ставка кредита//
    private int time; // срок кредита
    public Credit(int procent, int time){//Конструктор для объектов типа Кредит//
        this.procent = procent;
        this.time = time;
    }
    public int getProcent() {
        return procent;
    }
    public void setProcent(int procent) {
        this.procent = procent;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    }

