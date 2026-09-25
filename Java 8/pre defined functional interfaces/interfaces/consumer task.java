import java.util.function.Consumer;
import java.util.ArrayList;

class Main{
   public static void main(String[] args){
      ArrayList<String> al1 = new ArrayList<>();
      al1.add("avatar");
      al1.add("spider-man");
      al1.add("batman");
      al1.add("oppenheimer");
   
      Consumer<String> c1 = s->System.out.println(s);
      for(String s: al1){
        c1.accept(s);
      }
   }
}
