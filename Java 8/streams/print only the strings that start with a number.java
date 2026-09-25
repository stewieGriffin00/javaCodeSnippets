// print only the strings that start with a number  

import java.util.List;
import java.util.Arrays;

class Main{
   public static void main(String[] args){
      List<String> words = Arrays.asList("one", "2wo", "3hree", "four", "5ive", "six");

      words.stream().filter(x-> Character.isDigit(x.charAt(0))).forEach(y->System.out.println(y)); 
       
   }
   
}