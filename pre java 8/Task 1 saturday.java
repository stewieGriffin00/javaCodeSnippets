// Number guessing game with only 5 tries
import java.util.Scanner;
import java.util.Random;
class NumberGuessingGame{
    public static void main(String[] args){
        Random randNum = new Random();
        int userInput, computerNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number between 1 to 100: ");
        userInput = sc.nextInt();
        computerNumber = randNum.nextInt(1,101);
        System.out.println("computerNumber: "+computerNumber);
        guessNumber(userInput, computerNumber);
    }
    static void guessNumber(int u,int c){
        Scanner sc = new Scanner(System.in);
        int tries = 0, points = 500;
        for(tries = 1;tries<=5;tries++){
            if(u == c){
                System.out.println("you win points:"+points + " no of tries: "+tries);
                break;
            }
            else{
                if(tries == 5){
                    System.out.println(" you lose GAME OVER!! tries: "+tries);
                    break;
                }
                if(u<c){
                    System.out.println(" Number is smaller Guess again tries: "+tries);
                }
                else{
                    System.out.println(" Number is larger Guess again  tries: "+tries);
                }
                System.out.println(" Enter a number between 1 to 99: ");
                u = sc.nextInt();
                points -= 100;
            }
        }
    }
}