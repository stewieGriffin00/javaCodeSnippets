import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Strings{
    public static void main(String[] args){
        int number, count=0;
        String word = "3a4c";
        System.out.println(word);
        StringBuilder stringbuild1 = new StringBuilder("");
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(word);

        for(int j=0; m.find(); j+=2){
            number = Integer.parseInt(m.group()); 
            System.out.println(number);
            for(int i=0; i<number; i++){ 
                stringbuild1.append(word.charAt(j+1)+""); 
                // System.out.println(stringbuild1);
            }
        }
        System.out.println(stringbuild1);
    }
}

