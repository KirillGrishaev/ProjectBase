package Service;
import vehicle.Vehicle;
import java.io.*;
import java.util.List;
public class Buy {
    private static final String CATALOG_NAME = "file/";
    public static void buy () {
        List <Vehicle> listOfVehicle = ConvertVehicle1ToCollect.convertRun();
      try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
          System.out.println("Выберите интересующую позицию (отсчет идет с 0): ");
          int position = Integer.parseInt(reader.readLine());
          System.out.println("Выберите количество товара (до 10 у.е.):");
          int count = Integer.parseInt(reader.readLine());
          if (count<=10) {
          Vehicle vehicle = listOfVehicle.get(position);
          int price = vehicle.getPrice();
          int total = price*count;
          System.out.println("Спасибо за заказ. Итоговая сумма: "+total+" у.е.\n" +
                  "Мы знаем, что выбора у вас небыло, но все равно спасибо что воспользовались услугами нашей компании!");
          } else {System.out.println("Сказали же, не больше 10 у.е. за раз в одни руки!\n*Жизнь великого Рейнджера закончилась*");}
} catch (IOException e) {
    e.printStackTrace();
      }
    }
}