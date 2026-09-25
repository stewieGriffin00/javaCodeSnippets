import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        System.out.println(" type a word ");
        String word = new Scanner(System.in).next();
        word = word.toLowerCase();
        StringBuilder reapeatLetters = new StringBuilder();
        char ch;
        for(int i=0; i<word.length(); i++){
            ch = word.charAt(i);
            if(word.indexOf(ch) != word.lastIndexOf(ch) && !(reapeatLetters.toString().contains(ch+""))){
                reapeatLetters.append(ch);
            }
        }
        if(reapeatLetters.length() == 0){
            System.out.println(" repeated letters in "+ word +" is nil");
        }
        else{
            System.out.println(" repeated letters in "+ word +" is "+reapeatLetters);
        }
    }
}
