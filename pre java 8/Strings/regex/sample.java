import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Strings{
    public static void main(String[] args){
        System.out.println(" enter a sentence ");
        String input = new Scanner(System.in).nextLine();
        String input = "hello world";
        String[] stringArray = input.split("\\s+");
        for(int i=stringArray.length-1; i>=0; i--){
            System.out.print(stringArray[i]+" ");
        }
    }   
}

