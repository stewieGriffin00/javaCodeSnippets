import java.util.Scanner;

class PatternProblems{
    public static void main(String[] args){
        System.out.println("diamond pattern  \n");
        System.out.println(" enter a number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(" you enter: "+n+" \n");
        for(int i = 1; i<= n; i++){
            for(int k = n-i; k>= 1; k--){
                System.out.print(" ");
            }
            for(int j = 1; j<= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i= n-1; i>= 1; i--){
            for(int j= n-i; j>=1;j--){      
                  System.out.print(" ");   
            }
            for(int j= i; j>= 1; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


