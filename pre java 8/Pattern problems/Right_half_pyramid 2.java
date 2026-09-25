import java.util.Scanner;

class PatternProblems{
    public static void main(String[] args){
        System.out.println("Right Half Pyramid  \n");
        for(int i= 0; i<= 4; i++){
            for(int j= 0; j<= 4; j++){
                if(i>= j){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/* i = 1
        j = 4 to 1 
        k = 1 to 1
   i = 2 
        j = 3 to 1 
        k = 2 to 1 


 */



