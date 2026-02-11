public class Gamble{
      
   public static void initialize(){
      int[] deck = new int[52];
      for(int i=0; i<deck.length; i++)
         deck[i] = i;
   }
         
   public static void main(String[] args){
      initialize();
   }
}