import java.util.ArrayList;

class Main{
   public static void main(String[] args){
      ArrayList<String> s = new ArrayList<>();
      s.add("hello");
      s.add("physics");
      s.add("computer");
      s.add("aeroplane");
      s.add("entertainment");
      s.add("nationality");
      s.add("apple");
      
      System.out.println("list: "+ s+ "\n their lengths");
      s.stream().map(x-> x.length()).forEach(y-> System.out.print(y+" "));
   }
}