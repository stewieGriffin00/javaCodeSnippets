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
      
      System.out.println(" sorting in ascending order ");
      al.stream().sorted().forEach(x-> System.out.println(x));

      System.out.println(" sorting in descending order ");
      al.stream().sorted((m,n)-> n-m).forEach(x-> System.out.println(x));
  
   }
}

