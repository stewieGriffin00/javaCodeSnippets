import java.util.function.Function;

class Main{
   public static void main(String[] args){
      
      Function<Integer, Integer> f1 = (x)-> x*2;
      Function<Integer, Integer> f2 = (x)-> x+10;

      Function<Integer, Integer> compose = f1.compose(f2);

      System.out.println(compose.apply(20)); 

      /* first the function passed in compose is resolved and then the one outside it. 
         here we have 20 is passed to f2 and we get 30 as o/p and then 30 is passed to f1
         where we multiply it by 2.

         we get answer as 60.
       */
      




   }  
}

