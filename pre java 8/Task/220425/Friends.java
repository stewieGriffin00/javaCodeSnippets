// p \
// System.out.println();
import java.util.Scanner;
class  Friends{
    public static void main(String[] args){
        int userChoice;
        long  userInput2;
        String userInput;
        boolean runProgramme = true;
        Subclass obj1 = new Subclass();
        Scanner sc = new Scanner(System.in);
        while(runProgramme){
            System.out.println(" Enter number to enter its info:");
            System.out.println(" 1. Name\n 2. Age\n 3. number\n 4. department\n 5. hobby\n 6. native state \n 7. display all info");
            userChoice = sc.nextInt();
            switch(userChoice){
                case 1:{
                    System.out.println(" enter name: ");  
                    userInput = sc.next();
                    System.out.println(" you entered: "+userInput);
                    obj1.fName = userInput;
                    break;
                }
                case 2:{
                    System.out.println(" Enter friend age:");
                    userInput2 = sc.nextInt();
                    System.out.println(" you entered: "+userInput2);
                    obj1.age = userInput2;
                    break;
                } 
                case 3:{
                    System.out.println(" Enter friend phone number :");
                    userInput2 = sc.nextInt();
                    System.out.println(" you entered: "+userInput2);
                    obj1.pNumber = userInput2;
                    break;
                } 
                case 4:{
                    System.out.println(" Enter friend department :");
                    userInput = sc.next();
                    System.out.println(" you entered: "+userInput);
                    obj1.department = userInput;
                    break;
                } 
                case 5:{
                    System.out.println(" Enter hobby :");
                    userInput = sc.next();
                    System.out.println(" you entered: "+userInput);
                    obj1.hobby = userInput;
                    break;
                } 
                case 6:{
                    System.out.println(" Enter friend native  :");
                    userInput = sc.next();
                    System.out.println(" you entered: "+userInput);
                    obj1.nAtive = userInput;
                    break;
                } 
                case 7:{
                    System.out.println("all info");
                    obj1.displayAllInfo();
                    break;
                }
                default:
                    System.out.println(" enter only numbers from 1 to 7");
            }
            System.out.println(" want to run the programme again? enter 0 to stop ");
            userChoice = sc.nextInt();
            if(userChoice == 0){
                runProgramme = false;
            }
        }
    }
}

class Subclass{
    long age, pNumber;
    String department, hobby, fName, nAtive;
    void displayAllInfo(){
        System.out.println(" name:"+this.fName+"\n age:"+this.age+"\n number: "+this.pNumber+" \n department: "+this.department+" \n hobby: "+this.hobby+" \n native: "+this.nAtive);
    }
}
// 