import java.util.Scanner;
class Database{
    public static void main(String[] args){
        System.out.println(" ENter a number ");
        int m = new Scanner(System.in).nextInt();
        System.out.println(func1(m));        
    }
    static String func1(int m){
        if(m<10){
            return "less than 10";
        }
        return " number is greater than 10 or equal to 10 ";
        // System.out.println(" unreachable statement ");
    }
}

