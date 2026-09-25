import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        System.out.println(" enter a word ");
        String name = new Scanner(System.in).nextLine();
     
        // String name = "level";
        String reverseName = "";
        for(int i= name.length()-1; i>= 0; i--){
            reverseName  = reverseName.concat(""+ name.charAt(i));
            // .concat() method will not take any other data type as an argument except String 
            //  and any data type if it is add with string will be converted to string
        }
        System.out.println(" original string: "+name+"\n reversed string: "+ reverseName);
        System.out.println(name.equalsIgnoreCase(reverseName)?"it is a palindrome":" not a palindromes");
    }
}
