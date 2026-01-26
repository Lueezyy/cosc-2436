import java.util.Scanner;

public class Assignment02_01{

   public static double slope(int nx1, int ny1, int nx2, int ny2){
      return (double) (ny2 - ny1) / (nx2 - nx1);
   }
   
   public static double distance(int nx1, int ny1, int nx2, int ny2){
      return (double) Math.sqrt(Math.pow(nx2 - nx1, 2) + Math.pow(ny2 - ny1, 2));
   }
   
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter x1: ");
      int x1 = input.nextInt();
      System.out.print("Enter y1: ");
      int y1 = input.nextInt();
      System.out.print("Enter x2: ");
      int x2 = input.nextInt();
      System.out.print("Enter y2: ");
      int y2 = input.nextInt();
      System.out.println("Slope: " + slope(x1, y1, x2, y2));
      System.out.println("Distance: " + distance(x1, y1, x2, y2));
   }
}