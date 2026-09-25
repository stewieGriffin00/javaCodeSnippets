import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        System.out.println(" Count vowels and consonantants ");
        System.out.println(" enter a word: "); 
        String word = new Scanner(System.in).next();
        int vowel = 0, cons = 0;
        char ch;
        for(int i= word.length()-1; i>= 0; i--){
            ch = word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
                System.out.println(" vowel: "+ch);
            }
        }
        cons= word.length()-vowel;
        System.out.println(" word: "+ word+"\n vowels: "+vowel+"\n consonnats: "+cons);
    }
}
