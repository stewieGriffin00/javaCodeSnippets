import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        char c;
        System.out.println(" Enter a word");
        String s1 = new Scanner(System.in).next();
        System.out.println(" you entered: "+s1);
        StringBuffer s2 = new StringBuffer("");
        for(int i=s1.length(); i>= 1; i--){
            c = s1.charAt(i-1);
            s2.append(c);
        }
        System.out.println(" s2: "+s2);
        StringBuffer s3 = new StringBuffer(s2);
        if(s2.toString().equals(s3.toString())){
            System.out.println(s2+" is palindrome");
        }
        else{
            System.out.println(" Not palindrome ");
        }
    }
}
