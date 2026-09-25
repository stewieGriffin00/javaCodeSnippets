import java.util.function.Function;

class Main{
   public static void main(String[] args){
      
      Function<Integer, Integer> f1= (x)-> x*2;

      Function<Integer, Integer> f2 = (x)->x/2;

      Function<Integer, Integer> f3 = f1.andThen(f2);

      System.out.println(f3.apply(20)); // OP: 20

      /*  
         and then means the method that is written first is executed first and then as the name 
         implies the method written after
         so here f1 is called first and then f2.
         the value passed through apply is applied to f1 first and then to f2.
         so we get the output as 20.

         here is how it goes:
            the value '20' is passed to f1 and we get output as 40 and 
            then the value is passed to f2 and we get the output as 20 which is printed
            later in the console.

       */






   }  
}

