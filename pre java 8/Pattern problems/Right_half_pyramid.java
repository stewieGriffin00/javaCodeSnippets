import java.util.Scanner;

class PatternProblems{
    public static void main(String[] args){
        int i; // number of lines to print stars
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number ");
        i = sc.nextInt();
        System.out.println(" you entered: "+i);
        for(int j=1; j<=i ; j++ ){
            for(int k =1; k<=j; k++){ // number of stars you want to print 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

