// P p
class UPIpaymentSystemMain{
    public static void main(String[] args){
        
    }
}

class UPIpaymentSystem{
    void pay(double amount){
        System.out.println("payment done using Upi amount: "+amount);
    }
}

class Gpay extends UPIpaymentSystem{
    void pay(double amount){
        System.out.println("payment done using Gpay amount: "+amount);
    }
}

class Amazon extends UPIpaymentSystem{
    void pay(double amount){
        System.out.println("payment done using Amazon amount: "+amount);
    }
}

class Phonepe extends UPIpaymentSystem{
    void pay(double amount){
        System.out.println("payment done using Phonepe amount: "+amount);
    }
}