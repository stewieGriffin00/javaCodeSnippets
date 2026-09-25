class BankAccount{
    public static void main(String[] args){
        // System.out.println();
        Subclass ob1 = new Subclass(90877733,1200);
        Subclass ob2 = new Subclass();
        Subclass ob3 = new Subclass(5025209,13000);
        Subclass ob4 = new Subclass(92889269,300);
        Subclass ob5 = new Subclass(32976726,14000);
    }
}

class Subclass{
    int accountNumber,balance;
    Subclass(){
        System.out.println(" Account is created with Zero balance ");
    }
    Subclass(int accountNumber, int balance_deposit){
        if(balance_deposit<500){
            System.out.println(" Cannot create account with less than 500rs deposit more money");
        }   
        this.accountNumber = accountNumber;
        this.balance = balance_deposit;
        System.out.println(" aacont created balance:"+this.balance+" account number: "+this.accountNumber);
    }
}


