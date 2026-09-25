import java.util.function.UnaryOperator;

class Main{
  public static void main(String[] args){
    UnaryOperator<Integer> uo = i->i*100;
    System.out.println(uo.apply(2)); // 200

    UnaryOperator<String> uo1 = s-> s.substring(4);
    System.out.println(uo1.apply("entertainment")); // rtainment

  }
}
 
