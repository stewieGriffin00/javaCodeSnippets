import java.util.Scanner;
class Database{
    public static void main(String[] args){
        System.out.println(" Find Factorial \n enter a number");
        int number = new Scanner(System.in).nextInt();
        System.out.println("factorial of number: "+fact(number));
    }
    int fact(int h){
        int result = 1;
        result = result*h;
    }
}