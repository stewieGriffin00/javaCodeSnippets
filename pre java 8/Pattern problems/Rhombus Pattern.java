import java.util.Scanner;

class PatternProblems{
    public static void main(String[] args){
        System.out.println("enter a number to print the rhombus ");
        int m= new Scanner(System.in).nextInt();
        for(int i=0;i<=m-1;i++){
            for(int j=1; j<= i; j++){
                System.out.print("  ");
            }

            for(int k=1; k<=m; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



