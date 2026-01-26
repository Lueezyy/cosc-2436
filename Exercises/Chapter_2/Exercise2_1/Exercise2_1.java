import java.util.Scanner;

public class Exercise2_1{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a temperature in Celclius: ");
      double celcius = input.nextDouble();
      double farenheit = (9.0 / 5) * celcius + 32;
      System.out.println(celcius + " Celcius is " + farenheit + " Farenheit");
   }
}