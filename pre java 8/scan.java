import java.util.Scanner;
class Database{
    /*
        next(): takes only one word 
        nextLine(): takes a whole line
        nextInt(): takes only integer         
     */
    public static void main(String[] args){
        System.out.println(" Scanner Class ");
        Scanner s1 = new Scanner(System.in);
        System.out.println(" enter a word: ");
        String m = s1.nextLine();
        System.out.println(m);
    }
}
