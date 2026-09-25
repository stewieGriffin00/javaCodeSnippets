import java.util.List; 
import java.util.Arrays; 


class Main{
    public static void main(String[] args){
      List<Integer> li = Arrays.asList(10, 20, 30, 40, 50);

      System.out.println(li.stream().reduce((x,y)-> x+y).get());

      List<String> liString = Arrays.asList("helo", "hitler", "germany", "russia");
      System.out.println(liString.stream().reduce((x,y)-> (x+y)).get());

      List<Integer> al = Arrays.asList(1,2,3,4,5);

      System.out.println(al.stream().reduce((a,b)->a+b).get());
    }
}
/*  reduce method is used for reducing the stream elements into one entity.
  Like here we have reduced all the integers into one integer by calculating a sum 
  of all their sums.

    we can also concatenate all the string using the same reduce method. like we did  

  syntax:
      here we have summed the elements using x+y expression. which is followed by a 
      get method. Which if isn't used will get the value surrounded by optional 
      on both the sides. like Optional[150]. if we use get we get just 150.
 */
