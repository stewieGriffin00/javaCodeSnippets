class Encapsulation2{
    public static void main(String[] args){
        BankAccount ob1 = new BankAccount(1122244,10000);
        BankAccount ob2 = new BankAccount(8729384,50000);
        System.out.println(ob1.getAccountNumber());
        System.out.println(ob1.getBalance());
        System.out.println(ob2.getAccountNumber());
        System.out.println(ob2.getBalance());
        ob1.setAccountNumber(82773239);
        ob2.setAccountNumber(2525523);
        ob1.setBalance(77699);
        ob2.setBalance(99087);
        System.out.println(ob2.getAccountNumber());
        System.out.println(ob2.getBalance());
        System.out.println(ob1.getAccountNumber());
        System.out.println(ob1.getBalance());
    }   
}

class BankAccount{
    BankAccount(int ac, int bal){
        this.accountNumber = ac;
        this.balance = bal;
    }
    private int accountNumber, balance;
    int getAccountNumber(){
        return accountNumber;
    }
    int getBalance(){
        return balance;
    }
    void setAccountNumber(int ac){
        accountNumber = ac;
    }
    void setBalance(int bal){
        balance = bal;
    }
}