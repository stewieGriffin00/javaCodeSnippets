class BankAccoutMain{
    public static void main(String[] args){
        BankAccout ob1 = BankAccout();
        ob1.setAccountNum("0970101049070");
        
    }
}   

class BankAccout{
    private String accountNumber;
    private double balance = 50_000;
    double getBalance(){
        return balance;
    }
    void setAccountNum(String acno){
        accountNumber = acno;
    }
}