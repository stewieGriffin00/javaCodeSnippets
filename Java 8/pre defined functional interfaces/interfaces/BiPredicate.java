import java.util.function.BiPredicate;

class Main{
   public static void main(String[] args){
      BiPredicate<String, Integer> biP = (String s, Integer i)->{return s.length()==i;};
      System.out.println(biP.test("java",4));
      System.out.println(biP.test("India",10));

      BiPredicate<Integer , Integer> biP2 = (Integer i1, Integer i2)->{return !(i1==i2);};
      System.out.println(biP2.test(10,11));
      System.out.println(biP2.test(15,18));
      System.out.println(biP2.test(30,19));
   }
}
   /*  we  can pass two different data type parameter in bipredicate it can be even of same type  
    */
