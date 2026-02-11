public class Search{

   public static int binarySearch(int[] intArray, int sn){
      boolean found = false;
      int lo = 0;
      int hi = intArray.length - 1;
      int mid = 0;
      while (lo <= hi && !found){
         mid = (lo + hi)/2;
         if (intArray[mid] == sn)
            found = true;
         else{
            if (sn > intArray[mid])
               lo = mid + 1;
            else
               hi = mid - 1;
         }
      }
      if (found)
         return mid;
      else
         return -1;
   }
   
   public static void main(String[] args){
      
   }
}