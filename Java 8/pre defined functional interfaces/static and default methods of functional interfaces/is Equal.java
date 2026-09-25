import java.util.function.Predicate;

class Main{
   public static void main(String[] args){
      Predicate<String> p1 = Predicate.isEqual("polymoprhism");

      System.out.println(p1.test("jafer")); // false
      System.out.println(p1.test("polymoprhism")); // true
   }  
}

