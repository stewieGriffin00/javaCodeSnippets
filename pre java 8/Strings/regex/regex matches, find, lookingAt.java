import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Strings{
    public static void main(String[] args){
        String nums = "jaffer123";
        Pattern pat = Pattern.compile("\\d+");
        Matcher match = pat.matcher(nums);
        System.out.println(match.lookingAt()); 
        System.out.println(match.matches());
        System.out.println(match.find());
    }   
}
