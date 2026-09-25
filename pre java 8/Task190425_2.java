import java.util.Scanner;
class SwitchCase{
    public static void main(String[] args){
        int userChoice;
        boolean runProgrammeAgain = true;
        Scanner sc = new Scanner(System.in);
        displayMessage();
        userChoice = sc.nextInt();
        double userInput1, userInput2, result;
        while(runProgrammeAgain){
            switch(userChoice){
            case 1: {
                System.out.println(" Enter two numbers ");
                userInput1 = sc.nextDouble();
                System.out.println(" enter another number ");
                userInput2 = sc.nextDouble();
                result = userInput1 + userInput2;
                System.out.println(" result: "+ result);
                break;
            }
            case 2:{
                System.out.println(" Enter two numbers ");
                userInput1 = sc.nextDouble();
                System.out.println(" enter another number ");
                userInput2 = sc.nextDouble();
                result = userInput1 - userInput2;
                System.out.println(" result: "+ result);
                break;
            }
            case 3:{
                System.out.println(" Enter two numbers ");
                userInput1 = sc.nextDouble();
                System.out.println(" enter another number ");
                userInput2 = sc.nextDouble();
                result = userInput1 * userInput2;
                System.out.println(" result: "+ result);
                break;
            }
            case 4:{
                System.out.println(" Enter two numbers ");
                userInput1 = sc.nextDouble();
                System.out.println(" enter another number ");
                userInput2 = sc.nextDouble();
                result = userInput1 / userInput2;
                System.out.println(" result: "+ result);
                break;
            }
            case 5:{
                System.out.println(" Enter two numbers ");
                userInput1 = sc.nextDouble();
                System.out.println(" enter another number ");
                userInput2 = sc.nextDouble();
                result = userInput1 % userInput2;
                System.out.println(" result: "+ result);
                break;
            }
            case 6:{
                System.out.println(" enter the radius of circle ");
                userInput1 = sc.nextDouble();
                result = (22*userInput1*userInput1)/7;
                System.out.println(" area of circle: "+ result);
                break;
            }
            case 7:{
                System.out.println(" Enter length of rectangle ");
                userInput1 = sc.nextDouble();
                System.out.println(" enter breadth ");
                userInput2 = sc.nextDouble();
                result = userInput1 * userInput2;
                System.out.println(" area of rectangle: "+ result);
                break;
            }
            case 8:{
                System.out.println(" enter a number to sqaure:");
                userInput1 = sc.nextDouble();
                result = userInput1*userInput1;
                System.out.println(" square of " +userInput1+" is "+result);
                break;
            }
            case 9:{
                System.out.println(" enter a number to cube:");
                userInput1 = sc.nextDouble();
                result = userInput1*userInput1*userInput1;
                System.out.println(" cube of " +userInput1+" is "+result);
                break;
            }
            case 10:{
                System.out.println(" Enter two numbers to do (a+b)^2 ");
                userInput1 = sc.nextDouble();
                System.out.println(" enter another number ");
                userInput2 = sc.nextDouble();
                result = (userInput1*userInput1) + (userInput2*userInput2)+ (2*userInput1*userInput2);
                System.out.println(" result: "+ result);  
                break;             
            }
            default:
                System.out.println(" Enter a number between only 1 and 10 ");
        }
            System.out.println(" do you wnat to run programme again: enter 0 for no");
            userInput1 = sc.nextInt();
            if(userInput1 == 0){
                runProgrammeAgain = false;
            }
            else{
                displayMessage();
                userChoice = sc.nextInt();
            }   
        }
        
    }
    static void displayMessage(){
        System.out.println(" Enter a number ");
        System.out.println(" 1. Addition  ");
        System.out.println(" 2. Subtraction ");
        System.out.println(" 3. Multiplcation ");
        System.out.println(" 4. Division ");
        System.out.println(" 5. Modulus");
        System.out.println(" 6. circle area");
        System.out.println(" 7. Area of recrtangle");
        System.out.println(" 8. Square ");
        System.out.println(" 9. Cube ");
        System.out.println(" 10. (a+b)^2 ");
        return;
    }
}