import java.util.function.BiConsumer;

class Main{
   public static void main(String[] args){
      // BiPredicate<String, Integer> biP = (String s, Integer i)->{return s.length()==i;};
      // System.out.println(biP.test("java",4));
      // System.out.println(biP.test("India",10));

      BiConsumer<Integer, String> biP2 = (Integer i1, String s1)->{System.out.println("you passed: "+i1+"\n string: "+s1);};
      biP2.accept((Integer)10, "hello");
   }
}
 
