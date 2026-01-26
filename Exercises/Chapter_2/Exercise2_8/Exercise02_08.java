import java.util.Scanner;

public class Exercise02_08{
   public static void main(String[] args){
      //custom time
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the time zone offset to GMT: ");
      int diff = input.nextInt();
      //compute time
      long totalMs = System.currentTimeMillis();
      long totalSec = totalMs / 1000;
      long currentSec = totalSec % 60;
      long totalMin = totalSec / 60;
      long currentMin = totalMin % 60;
      long totalHr = totalMin / 60;
      long currentHr = (totalHr + diff) % 24;
      System.out.print("Current time in GMT is " +  currentHr + ":" + currentMin + ":" + currentSec);
   }
}