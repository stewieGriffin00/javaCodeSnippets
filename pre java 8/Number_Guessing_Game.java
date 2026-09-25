import java.util.Scanner;
import java.util.Random;
class RandomNumberGenerator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userInput,computerNumber;
        Random random_nnumber  = new Random();
        boolean choice = true; 
        System.out.println(" enter a number between 1 to 100 ");
        userInput = sc.nextInt();
        computerNumber = random_nnumber.nextInt(1,100);
        while(choice){
            if(userInput == computerNumber ){
                System.out.println(" you win computer: "+computerNumber+" your number: "+userInput);  
                choice = false; 
            }
            else{
                if(userInput > computerNumber){
                    System.out.println(" your number is large ");
                }
                else{
                    System.out.println(" your number is small");
                }
                System.out.println(" enter another number ");
                userInput = sc.nextInt();
            }
        }
    }
}
