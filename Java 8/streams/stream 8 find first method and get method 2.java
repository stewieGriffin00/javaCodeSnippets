import java.util.ArrayList;

class Main{
    public static void main(String[] args){
      ArrayList<Integer> al = new ArrayList<>();
      al.add(998);
      al.add(300);
      al.add(100);
      al.add(500);
      al.add(200);
      al.add(400);
      al.add(600);
      al.add(800);
      al.add(100);
      
      System.out.println(al.stream().findFirst().get());
 
    }
}

