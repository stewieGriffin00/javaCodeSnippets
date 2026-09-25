import java.util.List;
import java.util.Arrays;

class Main{
   public static void main(String[] args){ 
      List<String> list = Arrays.asList("12345", "1234567", "1234", "12345678", "123456789");

      list.stream().sorted((x,y)-> y.length()- x.length()).forEach(System.out::println);
      
   }
}

