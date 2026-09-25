import java.util.Scanner;

class PatternProblems{
    public static void main(String[] args){
        int i; // number of lines to print stars
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number ");
        i = sc.nextInt();
        System.out.println(" you entered: "+i);

        for(int j= i; j>=1; j--){
            for(int k=j; k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

