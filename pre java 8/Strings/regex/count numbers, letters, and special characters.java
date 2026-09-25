import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Strings{
    public static void main(String[] args){
        System.out.println(" count the alphabets digits and special characters ");
        System.out.println(" enter a word with letters, characters and numbers also  ");
        String input = new Scanner(System.in).next();
        StringBuilder sbAlphabets = new StringBuilder("");
        StringBuilder sbNumbers = new StringBuilder("");
        StringBuilder sbSpecial = new StringBuilder("");
        Pattern patA = Pattern.compile("[a-zA-Z]");
        Pattern patNumbers = Pattern.compile("\\d");
        Pattern patSpecial = Pattern.compile("\\W");
        Matcher match = patA.matcher(input);
        Matcher match2 = patNumbers.matcher(input);
        Matcher match3 = patSpecial.matcher(input);

        int alphabetsCount = 0 , numberCount = 0 , specialCharCont = 0;
        while(match3.find()){
            if(!(sbAlphabets.toString().contains(match.group()+""))){
                sbAlphabets.append(match.group());
                alphabetsCount++;
            }
        }
        System.out.println(" no of alphabets: "+ alphabetsCount);
        System.out.println(" all alphabets: "+ sbAlphabets);

        // while(match2.find()){
        //     if(!(sbNumbers.toString().contains(match.group()+""))){
        //         numberCount += 1;
        //         sbNumbers.append(match.group());
        //     }
        // }
        // System.out.println(" no of alphabets: "+ numberCount);
        // System.out.println(" all alphabets: "+ sbNumbers);

        // while(match3.find()){
        //     if(!(sbSpecial.toString().contains(match.group()+""))){
        //         specialCharCont += 1;
        //         sbSpecial.append(match.group());
        //     }
        // }
        // System.out.println(" no of special characters: "+ specialCharCont);
        // System.out.println(" all characters: "+ sbSpecial);
    }   
}
