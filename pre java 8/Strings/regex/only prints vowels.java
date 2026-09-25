import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Strings{
    public static void main(String[] args){
        System.out.println(" only prints vowels ");
        System.out.println(" enter a word only with letters  ");
        String input = new Scanner(System.in).next();
        StringBuilder sb = new StringBuilder("");
        Pattern pat = Pattern.compile("[aeiou]+");
        Matcher match = pat.matcher(input);
        int vowelCount = 0;
        while(match.find()){
            if(!(sb.toString().contains(match.group()+""))){
                vowelCount+=1;
                sb.append(match.group());
            }
        }
        System.out.println(" no of vowels: "+ vowelCount);
        System.out.println(" all vowels: "+ sb);
    }   
}
