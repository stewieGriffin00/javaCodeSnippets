import java.util.function.Predicate;

class Main{
   public static void main(String[] args){
      Predicate<Integer> pInt  = (Integer a)-> a>100;
      System.out.println(pInt.test(101)); // true    
      System.out.println(pInt.test(90)); // false

      Predicate<String> pString = (String s)-> s.equals("done"); 
      System.out.println(pString.test("hello")); // false   
      System.out.println(pString.test("done"));  // true
   
      Predicate<Double> p= (Double d)-> d.equals(3.14);

      System.out.println(p.test(0.1));
      System.out.println(p.test(3.14));
   }
}
