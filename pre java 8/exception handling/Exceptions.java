// System.out.println();
import java.util.Scanner;
class Database{
    public static void main(String[] args){
        String name ="hello";
        System.out.println(name.charAt(0));
        // System.out.println(name.charAt(5)); // string index out of bounds exception

        int num = 10, num1 = 0;
        // System.out.println(num/num1); // arithmetic exception  

        String name1 = null;    
        // System.out.println(name1.length()); // null pointer exception

        System.out.println(" enter your name ");
        // int num3 =  new Scanner(System.in).nextInt(); // input mismatch exception

        int[] arr2 = {0,1,2};
        // System.out.println(arr2[3]); // array index out of bound exception 
    }
}