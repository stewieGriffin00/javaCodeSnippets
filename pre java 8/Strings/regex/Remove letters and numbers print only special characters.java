import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Strings{
    public static void main(String[] args){
        System.out.println(" Remove letters and numbers print only special characters");
        System.out.println(" enter a word with numbers, letters and special characters");
        String input = new Scanner(System.in).next();
        Pattern pat = Pattern.compile("\\W+");
        Matcher match = pat.matcher(input);
        while(match.find()){
            System.out.print(match.group());
        }
    }   
}
