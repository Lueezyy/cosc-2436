import java.util.Scanner;

public class Assignment01_03{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int lottery = (int)(Math.random() * 90 + 10);
      int lotteryDigit1 = lottery / 10;
      int lotteryDigit2 = lottery % 10;
      System.out.print("Enter the lottery pick (two digits): ");
      int guess = input.nextInt();
      int guessDigit1 = guess / 10;
      int guessDigit2 = guess % 10;
      System.out.println("The lottery number is: " + lottery);
      if (guess == lottery) {
         System.out.println("Exact match!! You won $10000");
      }
      else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
         System.out.println("Nice try!! You won $3000");
      }
      else if (guessDigit1 == lotteryDigit1 || 
            guessDigit1 == lotteryDigit2 || 
            guessDigit2 == lotteryDigit1 || 
            guessDigit2 == lotteryDigit2) {
         System.out.println("You matched one digit! You won $100");
      }
      else {
         System.out.println("Sorry, no match.");
      }
   }
}