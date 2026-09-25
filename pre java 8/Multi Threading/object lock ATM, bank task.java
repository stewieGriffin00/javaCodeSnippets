class MultiThreading{
    public static void main(String[] args){
        Bank bank = new Bank();
        ATM connect2 = new ATM("ATM",bank);
        Gpay connect1 = new Gpay("G-Pay",bank);
        connect1.start();
        connect2.start();
        System.out.println("bank balance: "+Bank.amount);
    }
}

class Bank{
    static int amount = 20_000;
    public synchronized void deposit(int amount, String n){
        Bank.amount += amount;
        System.out.println(" deposited amount \nthread name:"+n+" \namount: "+amount+" balance: "+Bank.amount);
    }
    public synchronized void withdraw(int amount, String n){
        Bank.amount -= amount;
        System.out.println(" withdraw amount \nthread name:"+n+" \namount: "+amount+" balance: "+Bank.amount);
    }

}
class ATM extends Thread{
    Bank bank;
    ATM(String name, Bank bank){
        super(name);
        this.bank = bank;
    }   
    @Override
    public void run(){
        // System.out.println(" thread name: "+Thread.currentThread().getName());
        bank.withdraw(2_000,Thread.currentThread().getName());
        bank.deposit(3_500,Thread.currentThread().getName());
    }
}

class Gpay extends Thread{
    Bank bank;
    Gpay(String name, Bank bank){
        super(name);
        this.bank = bank;
    }   
    @Override
    public void run(){
        // System.out.println(" thread name: "+Thread.currentThread().getName());
        bank.withdraw(3_000,Thread.currentThread().getName());
        bank.deposit(2_500,Thread.currentThread().getName());
    }
}