import java.util.Scanner;

public class Assignment01_02{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your income: ");
      int income = (int) Math.round(input.nextDouble());
      int tax = 0;
      if (income > 40000){
         tax = (int) Math.round(income * 0.237);
      }
      else if (income > 20000){
         tax = (int) Math.round(income * 0.108);
      }
      else if (income > 10000){
         tax = (int) Math.round(income * 0.055);
      }
      else if (income > 5000){
         tax = (int) Math.round(income * 0.03);
      }
      else {
         tax = 0;
      }
      System.out.println("The tax owed is " + tax); 
   }
}