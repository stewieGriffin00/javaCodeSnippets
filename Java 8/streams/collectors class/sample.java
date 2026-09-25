import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

class Main{
   public static void main(String[] args){
      List<Integer> li = Arrays.asList(10,20,30,40,40);
      Set<Integer> set = li.stream().collect(Collectors.toSet());

      Map<Integer, Boolean> map = set.stream().collect(Collectors.toMap(x-> x, y-> y%2 == 0));
      System.out.println(map);
   }
}