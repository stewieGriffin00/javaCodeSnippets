import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENter a word without space");
        String word = sc.next();
        char[] chArr1, chArr2;
        chArr1 = word.toCharArray();
        chArr2 = word.toCharArray();
        char temp1, temp2;
        int j = 0;
        for(int i =  (chArr1.length/2)-1; i>= 0; i--){
            // System.out.println(chArr1[i]);
            chArr2[i] = chArr1[j]; 
            j++;
        }
        for(char c: chArr2){
            System.out.print(c);
        }

    }
}
