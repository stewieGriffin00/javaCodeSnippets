// code java 
package fsd53.oops.pro;

import java.util.Scanner;

public class ATMClass {
//    task for separate atm pin method
//    task add captcha before process
//    task enter mobile number and generate otp and set ATM Pin number

//    deposit
//    withdraw
//    balance enquiry
//    generate pin
//    change pin-number
//    card less deposit
//    card less withdraw
//
//
    //states
    double balance;
    int atmPin;
    Scanner scanner = new Scanner(System.in);

    //behaviours
    public void deposit() {
        System.out.println("Welcome to deposit method!!!");
        System.out.println("Enter your ATM pin number");
        int userEnteredAtmPin = scanner.nextInt();
        if (atmPin == userEnteredAtmPin) {
            //go for next
            System.out.println("Enter the amount to deposit");
            double depositedAmount = scanner.nextDouble();
            System.out.println("Deposit Success!");
            balance += depositedAmount;//deposit amt added to balance
            System.out.println("Deposit Amount : " + depositedAmount);
            System.out.println("Thank You$$$");
        } else {
            System.out.println("Invalid pin number");
        }
    }

    public void withdraw() {
        System.out.println("Welcome to withdraw method!!!");
        System.out.println("Enter your ATM pin number");
        int userEnteredAtmPin = scanner.nextInt();
        if (atmPin == userEnteredAtmPin) {
            System.out.println("Enter the amount to withdraw");
            double withdrawAmount = scanner.nextDouble();
            if (balance >= withdrawAmount) {
                System.out.println(withdrawAmount + "rs debited in your account!");
                balance -= withdrawAmount;
                System.out.println("Current Balance Amount : " + balance);
            } else {
                System.out.println("Insufficient Amount!");
            }
        } else {
            System.out.println("Invalid pin number");
        }
    }

    public void balanceEnquiry() {
        System.out.println("Welcome to balanceEnquiry method!!!");
        System.out.println("Enter your ATM pin number");
        int userEnteredAtmPin = scanner.nextInt();
        if (atmPin == userEnteredAtmPin) {
            System.out.println("Current Balance Amount : " + balance);
            System.out.println("Thank You");
        } else {
            System.out.println("Invalid pin number");
        }
    }
    public void generateAtmPin() {
        System.out.println("Welcome to generateAtmPin method!");
        System.out.println("Enter 4 digit number to generate atm pin number");
        int userAtmPin1 = scanner.nextInt();
        System.out.println("ReEnter atm pin number to generate atm pin");
        int userAtmPin2 = scanner.nextInt();
        if (userAtmPin1 == userAtmPin2) {
            atmPin = userAtmPin1;
            System.out.println("ATM Pin Number generated successfully...");
        } else {
            System.out.println("Entered Pin Number is wrong...");
            System.out.println("Try Again!!!");
        }
    }
    public void resetAtmPin() {
    }
}