import java.util.List;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
      List<String> al = Arrays.asList("objects", "static", "java", "string", "function", "float", "stringbuilder", "list", "lambda");
      
      System.out.println(al.stream().anyMatch(s-> s.startsWith("l")));
      System.out.println(al.stream().allMatch(s-> s.startsWith("l")));

 
    }
}

