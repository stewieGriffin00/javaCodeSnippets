import java.util.function.BinaryOperator;

class Main{
   public static void main(String[] args){
      BinaryOperator<String> bi1 =  A:: concat;
      System.out.println(bi1.apply("hellow", "world"));
      System.out.println(bi1.apply("lenovo", "laptop"));
   }
}

class A{
   static String concat(String s1, String s2){
      return s1+" "+s2;
   }
}