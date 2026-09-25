class Bank{
    private int accountNumber, balance;
    private String name;
    Bank(String name, int accountNumber, int balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance  =  balance;
    }
    void deposit(int depositAmount){
        if(depositAmount<=0){
            System.out.println(" Invalid deposit amount ");
            return;
        }
        else{
            balance += depositAmount;
            System.out.println("Amount Deposited: "+depositAmount+"\nAccount Balance: "+balance+"\n++++++++++");
        }
    }
    void withdraw(int debitAmount){
        if(debitAmount > balance){
            System.out.println("Invalid Debit amount ");
            return;
        }
        else{
            balance -= debitAmount;
            System.out.println("Amount Debited: "+debitAmount+"\nAccount Balance: "+balance+"\n++++++++++");
        }
    }
    void printDetails(){
        System.out.println("Name: "+name+"\nbalance: "+balance+"\naccount Number: "+accountNumber);
    }
}

class Encapsulation5{
    public static void main(String[] args){
        System.out.println(" Encapsulation task 5 ");
        Bank customer1 = new Bank("Bruce Wayne",11245,30_000);
        customer1.printDetails();
        customer1.withdraw(20000);
        customer1.deposit(1000);
    }
}



