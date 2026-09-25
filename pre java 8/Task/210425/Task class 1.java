// p
// System.out.println();
import java.util.Scanner;

class ATM1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ATM2 obj1 = new ATM2();
        System.out.println(" welcome to ATM Machine ");
        obj1.captcha();
        System.out.println(" Enter your pin number: ");
        int userInputPin = sc.nextInt();
        int userInput,uI;
        boolean userChoice = true;
        if(obj1.receivePinNumber(userInputPin)){
            System.out.println(" Pin is correct ");
             while(userChoice){
                obj1.serviceShow();
                userInput = sc.nextInt();
                switch(userInput){
                    case 1:
                        obj1.balanceShow();
                        break;
                    case 2:
                        obj1.depositMethod();
                        break;
                    case 3:
                        obj1.withdrawMethod();
                        break;
                    case 4:
                        obj1.setPin();
                        break;
                    case 5:
                        obj1.generatePin();
                        break;
                    case 6:
                        obj1.thankYouMessage();
                        break;
                }
                System.out.println(" DO you want to run the programme again enter 0 for no \n other numbers for yes");
                uI = sc.nextInt();
                if(uI == 0)
                    userChoice = false;
            }
        }
        else{
            System.out.println(" Pin is wrong ");
        }
    }
}