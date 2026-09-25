import java.util.Scanner;

class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String input3 = "java";

      String input = "";
      String input2 = "";
      int choice = 0;
      int life = 5;
      int count = 0;
      String word = input3;
      char[] star = new char[word.length()];
      char[] duplicateWord =  word.toCharArray();

      for(int i= 0; i<word.length(); i++){
         star[i] = '*'; 
      }

      while(true){
         input = "";
         System.out.println(star);
         System.out.println("\t enter a character ");
         input = sc.next();

         if(word.contains(input.charAt(0)+"")){
            input2 += input;
            for(int i=0; i< input2.length(); i++){
               if(word.contains(input2.charAt(i)+"")){
                  for(int j=0; j<duplicateWord.length; j++){
                     if(duplicateWord[j] == input2.charAt(i)){
                        star[j] = input2.charAt(i);
                     }
                  }
               }
            }
         }
         else{
            if(life == 1){
               System.out.println(" game over!".toUpperCase());
            }
            System.out.println("\t life remaining: "+--life);
         }
         
         System.out.print("\t star word: ");
         System.out.print(star);
         
         count = 0;
         char[] w = word.toCharArray();
         for(int i=0; i<w.length; i++){
            if(w[i] == star[i]){
                count++;
            }
            if(count == w.length){
               System.out.println("game win");
               return;
            }
         }
      }
   }
}