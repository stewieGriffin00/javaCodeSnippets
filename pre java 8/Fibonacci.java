import java.util.Scanner;
class PrintFibonacciNumbers{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s1.nextInt();
        long a=0,b=1,add=0;
        System.out.println(" Fibonacci Numbers ");
        System.out.println(0);
        System.out.println(1);
        for(int i = 3;i<=n;i++){
            add = a + b;
            System.out.println(add);
            a = b;
            b = add;
        }
    }
}


