import java.util.Random;
import java.util.Scanner;

class CharacterGuessingGame{
    public static void main(String[] args){
        /* for(int i = 97;i<=122;i++){
            char ch1 = (char) i;
            System.out.println(ch1);
        } */
        char userInput, computerCharacter; 
        int points = 500;
        Random randNum = new Random();
        computerCharacter = (char) randNum.nextInt(97,123);
        int c1 =  computerCharacter, u1;
        // System.out.println(c1);
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a character: ");
        userInput = sc.next().charAt(0);
        u1 =  userInput;
        // System.out.println(u1);k
        // System.out.println(" computer:" + computerCharacter);
        System.out.println(" user: "+userInput);
        for(int tries = 1; tries <= 5; tries++){
            if(userInput == computerCharacter){
                System.out.println(" you win points: "+points);
                break;
            }
            else{
                if(tries == 5){
                    System.out.println(" you lose ");
                    break;
                }   
                else{
                    if(u1>c1){
                        System.out.println(" charcter is large");
                    }
                    else{
                        System.out.println(" Character is small ");
                    }
                    System.out.println(" try again tries remaining: "+(5-tries));
                    System.out.println(" Enter another character: ");
                    userInput = sc.next().charAt(0);
                    u1 = userInput;
                    points -= 100;
                }
            }
        }
    } 
}

