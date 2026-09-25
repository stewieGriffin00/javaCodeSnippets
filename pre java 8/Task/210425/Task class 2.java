import java.util.Scanner;
import java.util.Random;
class ATM2{
    double balance = 10_000, userInput;
    int captchaNumber;
    int pinNumber = 5647;
    Scanner sc = new Scanner(System.in);
    Random randNum = new Random();
    boolean receivePinNumber(int p){   
        if(p == pinNumber)
            return true;
        else{
            System.out.println(" pin is wrong ");
            return false;
        }
    }
    void serviceShow(){
        System.out.println("Enter a number\n 1. Balance See\n 2. Deposit\n 3. Withdraw\n 4. change Pin\n 5. Generate Pin\n 6. Exit ");
    }
    void balanceShow(){
        System.out.println(" your balance: "+balance);
    }
    void depositMethod(){
        System.out.println(" enter the amount: ");
        userInput = sc.nextInt();
        balance = balance+userInput;
        System.out.println(" your balance now: "+balance); 
        return;
    }
    void withdrawMethod(){
        System.out.println(" enter the amount: ");
        userInput = sc.nextInt();
        if(userInput>balance){   
                System.out.println(" enter less amount than balance ");
                withdrawMethod();
            }
        balance = balance-userInput;
        System.out.println(" your balance now: "+balance);
        return;
    }
    void thankYouMessage(){
        System.out.println(" thank you visit again ");
    }
    boolean captcha(){
        captchaNumber = randNum.nextInt(1000,10000);
        System.out.println(captchaNumber+"\n enter the number display on screen ");
        userInput = sc.nextInt();
        if(userInput == captchaNumber)
            return true;
        else{
            System.out.println(" captcha is wrong enter the number again ");
            captcha();
        }
        return true;
    }   
    void setPin(){
        oTP();
        System.out.println(" enter new pin: ");
        userInput = sc.nextInt();
        pinNumber = (int) userInput;
        System.out.println(" Pin set successfully");
    }
    void oTP(){
        System.out.println(" enter the otp sent to mobile number.");
        int otp = randNum.nextInt(1000,10000);
        System.out.println("otp: "+otp+" \n enter otp");
        userInput = sc.nextInt();
        if(otp == userInput){
            return;
        } 
        else{
            System.out.println(" otp entered is wrong ");
            oTP();
        }
    }
    void generatePin(){
        oTP();
        pinNumber = randNum.nextInt(1000,10000);
        System.out.println(" your new pin: "+pinNumber);
    }
}

