import java.util.Scanner;

class Main{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input3 = "president";
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
            System.out.println("\t\n life remaining: "+ life+" ");
            System.out.print(star);
            System.out.print("\t enter a character: ");
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
                life -=1 ;
                if(life == 0){
                    System.out.println(" game over!".toUpperCase());
                    return;
                }
                System.out.println("\t\n life remaining: "+ life);
            }
            
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
