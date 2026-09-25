import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Strings{
    public static void main(String[] args){
        System.out.println(" Remove letters and print only numbers ");
        System.out.println(" enter a word with numbers and letters ");
        String nums = new Scanner(System.in).next();
        Pattern pat = Pattern.compile("\\d+");
        Matcher match = pat.matcher(nums);
        // System.out.println(match.matches());
        while(match.find()){
            System.out.print(match.group());
        }
    }   
}
