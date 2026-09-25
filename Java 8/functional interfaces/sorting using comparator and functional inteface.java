import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

class Main{
   public static void main(String[] args){-
      Comparator<String> c1 = (s1, s2) -> - s1.length()-s2.length();
      ArrayList<String> s = new ArrayList<>();
      s.add("entertainment");
      s.add("telephone");
      s.add("rocket");
      s.add("java");
      Collections.sort(s,c1);
      System.out.println(s);
   }
}
