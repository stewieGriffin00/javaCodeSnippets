class BankAccount{
    void withdraw(){
        System.out.println("Withdraw method from Bank Account class ");        
    }
    void deposit(){
        System.out.println("Deposit method from Bank Account class ");        
    }
}

class SavingsAccount extends BankAccount{

}

class CheckingAccount extends BankAccount{

}

class LoanAccount extends BankAccount{
    void loanAccount(){
        System.out.println(" This account is only used for taking loans ");
    }
}

class BankAccountMain{
    public static void main(String[] args){
        LoanAccount loanAcc1 = new LoanAccount();
        loanAcc1.loanAccount();
    }
}