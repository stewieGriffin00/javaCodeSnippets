// P p
// 
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Strings{
    public static void main(String[] args){
      String word = "java   class    today    hello come please   ";
      Pattern pattern = Pattern.compile("\\w+\\s+");
      Matcher match = pattern.matcher(word);
      int count =0;
      while(match.find()){
        count++;
      }
      System.out.println(" no. of spaces in the string: "+count);
    }  
}

