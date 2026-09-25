import java.util.function.Function;
import java.util.ArrayList;
import java.util.ListIterator;

class Main{
   public static void main(String[] args){
      ArrayList<Integer> iList = new ArrayList<>();
      for(int i=1; i<10; i++){
         iList.add(i);
      }
      System.out.println(iList);
   
      Function<Integer, Integer> f1 = a->a*a;
      Integer i ; 
      ListIterator<Integer> li = iList.listIterator();
      while(li.hasNext()){
         i = li.next();
         li.remove();
         i = f1.apply(i);
         li.add(i);
      }
      System.out.println(iList);
   }
}
