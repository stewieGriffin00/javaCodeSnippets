import java.util.Scanner;

class PatternProblems{
    public static void main(String[] args){
        System.out.println("K pattern \n");
        for(int i=5; i>= 1; i--){
            for(int j=i; j>= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i= 2; i<= 5; i++){
            for(int j= 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}




