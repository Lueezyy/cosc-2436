import java.util.Scanner;

public class Assignment01_04{
   public static void main(String[] args){
      int magicNumber = (int)(Math.random() * 101);
      Scanner input = new Scanner(System.in);
      System.out.println("Guess a magic number between 0 and 100: ");
      int guess = -1;
      while (guess != magicNumber){
         System.out.print("Enter your guess: ");
         guess = input.nextInt();
         if (guess < magicNumber){
            System.out.println("Your guess is too low");
         }
         else if (guess > magicNumber){
            System.out.println("Your guess is too high");
         }
         else {
            System.out.println("Yes, you got it!! The number is " + magicNumber);
         }
      }
   }
}