import java.util.Scanner;
class PatternProblems{
    public static void main(String[] args){
        System.out.println("Reverse left half pyramid \n");
        System.out.println(" Enter number of lines to print  ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("you entered+"+m+" \n");
        for(int i= 0; i<= m; i++){
                for(int j= 0; j<= m; j++){
                    if(j>=i){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
}






