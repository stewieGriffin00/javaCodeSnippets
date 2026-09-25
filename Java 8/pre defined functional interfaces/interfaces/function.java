import java.util.function.Function;

class Main{
  public static void main(String[] args){
    Function<String, Integer> c1 = s-> s.length();
    System.out.println(" length of python: "+c1.apply("python"));
    System.out.println(" length of entertainment: "+c1.apply("entertainment"));
    System.out.println(" length of psychology: "+c1.apply("psychology"));

    Function<Integer, String> f1= (Integer a)-> "value passed: "+a;

    System.out.println(f1.apply(10));
  }
}

