import java.util.ArrayList;

class Main{
   public static void main(String[] args){
      ArrayList<Integer> al = new ArrayList<>();
      al.add(100);
      al.add(200);
      al.add(300);
      al.add(400);
      al.add(500);

      al.stream().forEach((x)-> System.out.println(" "+x+" "));
   }
}

