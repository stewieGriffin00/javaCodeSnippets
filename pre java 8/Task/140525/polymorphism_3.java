class BankAccountMain{
    public static void main(String[] args){
        BankAccount loanAccount1 = new LoanAccount(); // upcasting 
        loanAccount1.withdraw(); // dynamic polymorphism 
        loanAccount1.deposit();
        LoanAccount loanAccount2 = (LoanAccount) loanAccount1;
        loanAccount2.withdraw();
        loanAccount2.deposit();
    }
}

class LoanAccount extends BankAccount{
    @Override
    void withdraw(){
        System.out.println("Withdraw method from Bank Account class ");        
    }
    @Override
    void deposit(){
        System.out.println("Deposit method from Bank Account class ");        
    }
}

class BankAccount{
    void withdraw(){
        System.out.println("Withdraw method from Loan Account class ");        
    }
    void deposit(){
        System.out.println("Deposit method from Loan Account class ");        
    }
}
