import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Database{
    public static void main(String[] args){
        String input = new Scanner(System.in).nextLine();
        System.out.printf("you entered %s: ",input);
        Pattern pat = Pattern.compile("^[a-zA-Z]{1}\\d+(?<=)@\\.com$");
        Matcher matcher = pat.matcher(input);
        while(matcher.matches()){
            System.out.println(" correct email ");
            return;
        }
        System.out.println("\n invalid email ");
    }
}