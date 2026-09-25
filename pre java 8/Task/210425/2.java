// java code 
package fsd53.oops.pro;

import java.util.Scanner;
public class ATMMachine {
    static Scanner scanner =  new Scanner(System.in);
    ATMClass atmClass = new ATMClass();
    public static void main(String[] args) {
//        new ATMMachine().atm();
        ATMMachine a = new ATMMachine();
        a.atm();
    }
    private void atm(){
        System.out.println("WELCOME TO FSD53 ATM MACHINE>>>");
        boolean exit =true;
        while (exit){
            System.out.println("1.Deposit\n2.Withdraw\n3.Balance Enquiry\n4.Exit");
            int user = scanner.nextInt();
            switch (user){
                case 1:atmClass.deposit();break;
                case 2:atmClass.withdraw();break;
                case 3:atmClass.balanceEnquiry();break;
                case 4:
                    System.out.println("Thanks For visiting FSD53 ATM Machine");exit=false;break;
                default:
                    System.out.println("Invalid Input Try Again!!!");
            }
        }
    }
}