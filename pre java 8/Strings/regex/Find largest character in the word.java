// P p
// Finding which letter is largest i.e which is at last in alphabetical order 
import java.util.Scanner;
class Strings{
    public static void main(String[] args){
      System.out.println("enter a word without spaces");
      String word = new Scanner(System.in).next();
      word = word.toLowerCase();
      char[] chArray = word.toCharArray();
      int value=0 , greaterValue = 0;
      for(char ch: chArray){
        value = ch;
        if(value>greaterValue){
          greaterValue = value;
        }
      }
      System.out.println(" largest character "+(char)greaterValue);
    }  
}

