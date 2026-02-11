public class Worksheet_01{

   public static void one(int x){
      if(x>0){
         System.out.print(x);
         one(x-1);
      }
   }
   
   public static int zoom(int x){
      if(x<1){
         return 1;
      }
      else{
         return x+zoom(x-1);
      }
   }
   
   public static int fun(int x){
      if(x<1){
         return x;
      }
      else{
         return x+fun(x-2);
      }
   }
   
   public static int wacky(int x, int y){
      if(x<=1)
         return y;
      else
         return wacky(x-1, y-1) + y;
   }
   
   public static int recur(int n){
      if(n<=10)
         return n*2;
      else
         return recur(recur(n/3));
   }

   public static int mystery2(int N) { 
      if (N<=1) 
         return 1; 
      else { 
         if (N % 2 == 1) 
            return N + mystery2(N-1); 
         else 
            return N - mystery2(N-1);
      } 
   }
   
   public static int mystery3(int A, int B){
      if (A<B)
         return A;
      else
         return B + mystery3(A-1, B+1);
   }
   
   public static int square(int N){
      if (N==1)
         return 1;
      else
         return square(N-1) + 2*N-1;
   }
   
   public static int funny(int x){
      if (x<1)
         return 1;
      else
         return x+funny(x-1)-funny(x-2);
   }
   
   
   public static void mystery(int n){
      if (n>1){
         System.out.print(n + " ");
         mystery(n-2);
      }
      else
         System.out.print(n);
   }
   
   public static int sumUp(int x){
      if (x>1)
         return x + sumUp(x-1);
      else
         return 1;
   }
   
   public static int numDigits(int n){
      if (n<10) 
         return 1;
      return 1 + numDigits(n/10);
   }
   
      public static int sumDigits(int n){
      if (n<10) 
         return n;
      return n%10 + sumDigits(n/10);
   }
   
   public static void main(String[] args){
      System.out.print(recur(27));
   }
}