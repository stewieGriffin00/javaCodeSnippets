// P p
class NotificationsMain{
    public static void main(String[] args){
        SMS sms1 = new SMS();
        sms1.message("yur recharge balance is over ");
    }
}

class Notifications{
    void messge(String message){
        System.out.println(" you have a message: \n"+message);
    }
}

class Email extends Notifications{
    void messge(String message){
        System.out.println(" you have a mail : \n"+message);
    }
}
class Whatapp extends Notifications{
    void messge(String message){
        System.out.println(" you have a Whatsapp message: \n"+message);
    }
}
class SMS extends Notifications{
    void messge(String message){
        System.out.println(" you have a SMS: \n"+message);
    }
}