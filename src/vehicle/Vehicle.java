package vehicle;

public class Vehicle {
    private String type;// тип техники
    private String name; // название
    private int price; // стоимость
    private String serviceLife; // срок службы
    private String weight; // вес
    public Vehicle (String type, String name, String serviceLife, String weight, int price){
        this.type = type;
        this.name = name;
        this.serviceLife = serviceLife;
        this.weight = weight;
        this.price = price;
    } //заданный конструктор
    public Vehicle(){

    } // пустой конструктор
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getServiceLife() {
        return serviceLife;
    }
    public void setServiceLife(String serviceLife) {
        this.serviceLife = serviceLife;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Vehicle1.txt{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", serviceLife=" + serviceLife +
                ", weight=" + weight +
                '}'+"\n";
    }
}