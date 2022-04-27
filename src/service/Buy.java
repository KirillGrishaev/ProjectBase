package service;
import java.util.*;
import exeption.OutOfLenght;
import vehicle.Vehicle;

public class Buy {
    public static void buy(String fileName, int position,int count) throws OutOfLenght{
        List <Vehicle> listOfVehicle = ConvertVehicle1ToCollect.convertRun(fileName);
      try{
          if (count<=10) {
          Vehicle vehicle = listOfVehicle.get(position);
          int price = vehicle.getPrice();
          int total = price*count;
          System.out.println("Спасибо за заказ. Итоговая сумма: "+total+" у.е.\n" +
                  "Мы знаем, что выбора у вас небыло, но все равно спасибо что воспользовались услугами нашей компании!");
          } else {
              throw new OutOfLenght("Попытка приобрести больше 10 едениц.\n");
          }
      } catch (IndexOutOfBoundsException e){
          System.out.println("Ты что, считать не умеешь?!\n" +
                  "*Жизнь великого Рейнджера закончилась.");
          } catch (NoSuchElementException ex){
          ex.printStackTrace();
      }
    }
}