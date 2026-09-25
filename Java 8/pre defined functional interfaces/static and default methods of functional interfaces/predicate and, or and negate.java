import java.util.function.Predicate;

class Main{
   public static void main(String[] args){
      Predicate<Integer> p1 = a-> a>10;
      Predicate<Integer> p2 = a-> a>20;

      System.out.println(p1.and(p2).test(30)); // both condition must be true  OP: true

      Predicate<Integer> c1 = b -> b>30;
      Predicate<Integer> c2 = c -> c == 31;

      System.out.println(c1.or(c2).test(31)); // anyone condition should be true OP: true
      System.out.println(c1.and(c2).test(45)); // anyone condition should be true OP: false

      System.out.println(c1.negate().test(20)); // it converts the boolean result into its opposite
    
   }
}

