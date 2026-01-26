import java.util.Scanner;

public class Exercise02_06{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer between 0 and 1000: ");
      int num = input.nextInt();
      int sum = (num % 10) + (num / 10 % 10) + (num / 100 % 10);
      System.out.println("The sum of all digits in " + num + " is " + sum);
   }
}