import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        String word = "abcdefgh";
        char[] charArrB,charArrA = word.toCharArray();
        charArrB = charArrA; 
         /* for(int i= 0; i< word.length()/2; i++){  // 8/2 = 4 
            charArrB[i] = charArrA[(word.length()-1)-i];
            charArrB[(word.length()-1)-i] = charArrA[i];  
         } */
        //  charArrA[0] = charArrB[7]; // h
        //  charArrA[1] = charArrB[6];
        //  charArrA[2] = charArrB[5];
        //  charArrA[3] = charArrB[4];
        //  charArrA[4] = charArrB[3];
        //  charArrA[5] = charArrB[2];
        //  charArrA[6] = charArrB[1];
        //  charArrA[7] = charArrB[0];
        int i=0;
         for(char ch : charArrB){
            System.out.println(ch+" "+i);
            i++;
         }   
    }
}
    // 0 1 2 3 
    // 7 
    /*  a 0
        b 1
        c 2
        d 3
        e 4
        f 5
        g 6
        h 7
     */

