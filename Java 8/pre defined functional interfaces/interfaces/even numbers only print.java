import java.util.function.Predicate;
import java.util.ArrayList;
// import java.util.Iterator;

class Main{
   public static void main(String[] args){
      ArrayList<Integer> al1 = new ArrayList<>();
      for(int i=1; i<=10; i++){
         al1.add(i);
      }
      System.out.println(al1);
      Predicate<Integer> prd = a->a%2==0;
      for(Integer i: al1){
         if(prd.test(i)){
            System.out.println(i);
         }
      }
   }
}
