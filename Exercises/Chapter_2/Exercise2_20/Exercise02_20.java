import java.util.Scanner;

public class Exercise02_20{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter balance and annual interest rate: ");
      double balance = input.nextDouble();
      double annualIntRate = input.nextDouble();
      double interest = balance * (annualIntRate / 1200);
      System.out.println("The interest is " + interest);
   }
}