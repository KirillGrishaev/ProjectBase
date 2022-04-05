package Service;
import java.util.*;
import exeption.OutOfLenght;
import fileApp.FileApp;
import vehicle.Vehicle;
import java.io.*;
public class Buy {
    public static void buy(Scanner sc) throws OutOfLenght{
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
          } else {
              throw new OutOfLenght("Попытка приобрести больше 10 едениц.\n");
          }
      } catch (IOException e) {
        e.printStackTrace();
      } catch (IndexOutOfBoundsException e){
          System.out.println("Ты что, считать не умеешь?!\n" +
                  "*Жизнь великого Рейнджера закончилась.");
          } catch (NoSuchElementException ex){
          ex.printStackTrace();
      }
    }
}