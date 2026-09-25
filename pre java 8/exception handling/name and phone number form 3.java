import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Database{
    static  String name;
    static  String eMail;
    public static void main(String[] args){
        System.out.println(" enter your name: ");
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\s?[a-zA-Z]+");
        while(true){
            name = new Scanner(System.in).nextLine();
            Matcher match = pattern.matcher(name);
            if(match.matches()){
                System.out.println(" corect name ");
                break;
            }
            else{
                System.out.println(" wrong name ");
            }
        }
        pass();
    }

    public static void pass(){
        System.out.println(" enter your number: ");
        int number = 0;
        try{
            number = new Scanner(System.in).nextInt();
        }
        catch(Exception e){
            System.out.println(" enter only numbers! ".toUpperCase());
            pass();
        }
        while(true){
            System.out.println(" enter your email: ");
            eMail = new Scanner(System.in).nextLine();
            System.out.println(eMail);
            Pattern pattern = Pattern.compile("^[\\w]+@[a-zA-Z]+.com$");
            Matcher match = pattern.matcher(eMail);
            if(match.matches()){
                System.out.println("------------------------");
                System.out.println(" correct details \n name: "+name+"\n number: "+number+" \n email: "+eMail);
                break;
            }
            else{
                System.out.println(" wrong email ");
            }
        }
    }
}



