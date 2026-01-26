import java.util.Scanner;

public class Assignment02_02{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of students: ");
      int count = input.nextInt();
      int [] scores = new int[count];
      System.out.print("Enter " + count + " scores: ");
      for (int i = 0; i < scores.length; i++){
         scores[i] = input.nextInt();
      }
      int highest = 0;
      for (int s : scores){
         if (s > highest)
            highest = s;
      }
      for (int i = 0; i < scores.length; i++){
         if (scores[i] >= highest - 10)
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
         else if (scores[i] >= highest - 20)
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
         else if (scores[i] >= highest - 30)
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
         else if (scores[i] >= highest - 40)
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
         else
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is F");
      }
   }
}