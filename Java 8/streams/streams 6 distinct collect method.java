import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Main{
   public static void main(String[] args){
      List<Integer> l1 = Arrays.asList(1,1,1,1,1,2,3,4,5,5,6,6,7,8,8,8,9);
      // List<Integer> l2 = l1.stream().distinct().collect(Collectors.toList());
      l1.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

      // System.out.println(l1);
      // System.out.println(l2);
   }
}