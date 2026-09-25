import java.util.ArrayList;

class Main{
   public static void main(String[] args){

      ArrayList<Integer> al = new ArrayList<>();
      al.add(15);
      al.add(6);
      al.add(18);
      al.add(14);
      al.add(5);
      al.add(31);
      al.add(27);
      al.add(3);
      al.add(12);
      
      System.out.println(" Array list is:  \n"+al);

      System.out.println(" Numbers divisible by 3 are:  \n");
      al.stream().filter(z->z%3 == 0).sorted().forEach(x-> System.out.println(" "+x));
  
   }
}

