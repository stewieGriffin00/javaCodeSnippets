// System.out.println();
import java.util.Scanner;
class Database{
    public static void main(String[] args){
        try{
            int[] arr= {1,2,3,4};
            System.out.println(arr[5]);
            String word = "hello";
            // System.out.println(word.charAt(5));   
        }
        catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException  e){
            System.out.println(" Exception ");
        }
    }
}
/* this type of catch statement accepts both exceptions array and string index out of bound
    both time the same implementation of the catch is executed.
 */
