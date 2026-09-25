// P p
class BAnkAccuntMain{
    public static void main(String[] args){
        
    }
}

class SavingsAccount extends Account{
    double balance=10000, interest=0.045;
    void balance(){
        System.out.println(" balance: "+balance);
    }
    void displayAccountType(){
        System.out.println(" account type = Savings ");
    }
    void applyInterest(){
        balance = (balance*interest)+balance;
        System.out.println(" balance now: "+balance);
    }
}

class FixedAccount extends Account{
    double balance=20000, interest=0.065;
    void balance(){
        System.out.println(" balance: "+balance);
    }
    void displayAccountType(){
        System.out.println(" account type Fixed Account");
    }
    void applyInterest(){
        balance = (balance*interest)+balance;
        System.out.println(" balance now: "+balance);
    }
}

class CuurentAccount extends Account{
    double balance=30000, interest=1;
    void balance(){
        System.out.println(" balance: "+balance);
    }
    void displayAccountType(){
        System.out.println(" account type Current");
    }
    void applyInterest(){
        balance = (balance*interest)+balance;
        System.out.println(" balance now: "+balance);
    }
} 

class Account{
    double balance=0, interest=1;
    void balance(){
        System.out.println(" balance: "+balance);
    }
    void displayAccountType(){
        System.out.println(" account type");
    }
    void applyInterest(){
        balance = (balance*interest)+balance;
        System.out.println(" balance now: "+balance);
    }
    /* void calculateINterest(){

    } */
}