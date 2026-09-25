import java.util.Arrays;

class Main{
   public static void main(String[] args){
      String[] abc = {"apple","zebra", "lemon", "elephant", "dog", "rat"};
      System.out.println("before sorting: "+ Arrays.toString(abc));
      SortStrings sortStrings = Arrays:: sort;
      sortStrings.startSorting(abc);
      System.out.println("after sorting: "+  Arrays.toString(abc));
   }
}

@FunctionalInterface
interface SortStrings{
   void startSorting(String[] s);
}