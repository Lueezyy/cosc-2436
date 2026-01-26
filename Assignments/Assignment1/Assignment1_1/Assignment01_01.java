import java.util.Scanner;

public class Assignment01_01{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the subtotal: ");
      double subtotal = input.nextDouble();
      System.out.print("Enter the gratuity rate: ");
      double gratuityRate = input.nextDouble();
      double gratuity = subtotal * (gratuityRate / 100);
      System.out.print("The gratuity is $" + gratuity + " and the total is $" + (subtotal + gratuity));
   }
}