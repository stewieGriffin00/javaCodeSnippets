import java.util.function.BinaryOperator;

class Main{
  public static void main(String[] args){
    BinaryOperator<String> bio1 = (s1, s2)-> (s1.equals(s2))?"equal":"not equal";

    System.out.println(bio1.apply("java", "python"));
    System.out.println(bio1.apply("java", "java"));
  }
}
 
