import java.util.Scanner;

class Main{
   public static void main(String[] args){
      String word = null;
      int num = 0;
      Scanner sc = new Scanner(System.in);

      System.out.println(" enter a number ");
      num = sc.nextInt();
      System.out.println(" you entered: "+ num);
      System.out.println(" enter a word ");
      // sc.nextLine();
      word = sc.nextLine();
      System.out.println(" you entered: "+ word);

     

      System.out.println(" programme ended ");
   }
}
/*       While we try to get a input using scanner class in java.
      we do it using the nextInt, nextLine, next method followed by a enter key pressing.
      So what happens while we try to get another input is that, the enter we entered following 
      the previous input. It gets stored inside the next varialble we try to store our input in.
      SO that is  why after we got an input we should call the 
      scanner_object_reference.nextLine(); method another time so that we can get input 
      in next time without any logical error.

          In above the programme only if you un-comment the sc.nextLine(); you will be able 
      to get the input in the word variable. 
       
 */
