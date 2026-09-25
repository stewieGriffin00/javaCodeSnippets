class Jaffer{
    public static void main(String[] args){
        Email email= new Gmail(new EncryptedEmail(new EmailSender()));
        email.sendEmail("decorator pattern works");
    }
}

interface Email{
    void sendEmail(String message);
}

class EmailSender implements Email{
    public void sendEmail(String message){
        System.out.println("email sender class "+ message); // 5
    }
}

class EncryptedEmail implements Email{
    Email emailProvideer;

    EncryptedEmail(Email emailProvideer){
        this.emailProvideer= emailProvideer;
    }  
    
    public void sendEmail(String message){
        System.out.println("reached Encrypted Email provider"); // 3
        emailProvideer.sendEmail(message); // 4
        System.out.println("printed the email sender message");
    }
}

class Gmail implements Email{
    Email emailProvideer;

    Gmail(Email emailProvideer){
        this.emailProvideer= emailProvideer;
    }  
    
    public void sendEmail(String message){
        System.out.println("reached Gmail Email provider"); // 1
        emailProvideer.sendEmail(message); // 2
        System.out.println("printed the encrypted email message");

    }
}

