// P p
class PaymentSystemMAin{
    public static void main(String[] args){
        
    }
}

class PaymentSystem{
    void pay(double amount){
        System.out.println(" amount:"+amount+" sent");
    }
    void offer(double percentage){
        System.out.println("you have new offer:"+percentage);
    }
}

class CreditCard extends PaymentSystem{
    void pay(double amount){
        System.out.println(" amount:"+amount+" sent");
    }
    void offer(double percentage){
        System.out.println("you have new offer:"+percentage+" in credit card edning in 5567");
    }
}
class DebitCard extends PaymentSystem{
    void pay(double amount){
        System.out.println(" amount:"+amount+" sent"+"from your DebitCard");
    }
    void offer(double percentage){
        System.out.println("you have new offer:"+percentage+" in DebitCard edning in 9987");
    }
}
class NetBanking extends PaymentSystem{
    void pay(double amount){
        System.out.println(" amount:"+amount+" sent using net banking");
    }
    void offer(double percentage){
        System.out.println("you have new offer:"+percentage);
    }
}