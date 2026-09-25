import java.util.Scanner;
class PrimeNumbers{
    public static void main(String[] args){
        System.out.println(" Enter a number: ");
        int number = new Scanner(System.in).nextInt();
        int i;
        while(true){
            for( i = 2; i<number; i++){
            int d;
            d = number % i;
            if(d == 0){
                System.out.println(number+" is not Prime");
                break;
            }
            }
            if(i == number-1){
                System.out.println(number+" is  Prime");
            }
            System.out.println(" enter 0 to stop programme or any other number to see if it is prime number ");
            int choice = new Scanner(System.in).nextInt();
            if(choice == 0)
                break;
            else{
                number = choice;
            }
        }       
    } 
}

