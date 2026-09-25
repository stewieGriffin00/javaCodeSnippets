import java.util.ArrayList;

class Main{
   public static void main(String[] args){
      ArrayList<Integer> al = new ArrayList<>();
      al.add(300);
      al.add(100);
      al.add(500);
      al.add(200);
      al.add(400);
      al.add(600);
      al.add(800);
      al.add(900);
      al.add(100);
      
      System.out.println(al.stream().skip(2).findFirst().get());

      // we can use  get when  the list contains only one item. 
      // it is usually used after the reduce method when all the elements are reduced down to one 
      // item.
      // Or in pogrammes like this where the item returns ony one value after it  finds first 
      // item  in the list
   }
}

