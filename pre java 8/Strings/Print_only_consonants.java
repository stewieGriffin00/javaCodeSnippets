import java.util.Scanner;
class PrintOnlyVowels{
    public static void main(String[] args){
        System.out.println(" Enter a Word");
        String s1 = new Scanner(System.in).next();
        StringBuffer s2 = new StringBuffer("");
        char a;
        for(int i=1;i<= s1.length(); i++){
            a = s1.charAt(i-1);
            if(!(a=='a'|| a=='e'|| a=='i' || a== 'o' || a == 'u')){
                if(!(s2.toString().contains(""+a))){
                    s2.append(a);
                }
            }
        }   
        if(s2.length()==0){
            System.out.println("no consonants in this word: "+s1);
        }
        else{
            System.out.println(" consonants in : "+s1+" are "+ s2);
        }
    }
}