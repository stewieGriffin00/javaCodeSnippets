import java.util.List; 
import java.util.Arrays; 
import java.util.function.Predicate; 

class Main{
  public static void main(String[] args){
    Predicate<String> p =  s->!(s.equals("java"));

    List<String> li = Arrays.asList("java", "python", "java", "ruby", "cpp", "html");

    li.stream().filter(p).forEach(x->System.out.println(x));
      
  }
}

