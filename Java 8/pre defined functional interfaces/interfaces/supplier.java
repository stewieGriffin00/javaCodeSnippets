import java.util.function.Supplier;

class Main{
  public static void main(String[] args){
    String word = "mindhunter";
    String word1 = "theory";

    Supplier<Integer> s1 = ()->word.length();
    System.out.println(s1.get());
    s1 = ()->word1.length();
    System.out.println(s1.get());

  }
}
 
