/* Since we used .next() function in Scanner class instead of .nextline() method the
   input user has given will be assigned to the second variable w2 without user even entering
   anything. Provided user enters two words separated by space. 
   this is because the Scanner class method next() takes the value available in the stream buffer
   since user enter two words only the first word is assigned to the first variable 
   the second variable is taken automatically.   
 */

import java.util.Scanner;
class Database{
    public static void main(String[] args){
        String w1,w2;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a word: ");
        w1 = sc.next();
        System.out.println(" enter another word: ");
        w2 = sc.next();
        System.out.println(" user entered: "+w1+" & "+w2);
    }
}


