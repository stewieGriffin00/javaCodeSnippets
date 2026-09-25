import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        double n1,n2,result;
        char ch1;
        int choice=1;
        /* static */ Scanner sc = new Scanner(System.in);
        while(choice == 1){
            System.out.println("Enter a number ");
            n1 = sc.nextDouble();
            System.out.println(" Enter second number ");
            n2 = sc.nextDouble();
            System.out.println(" Enter an operator + - * / % ");
            ch1 = sc.next().charAt(0);
            System.out.println("you entered:"+n1+" "+ch1+" "+n2);
            switch(ch1){
                case '+':{
                    result = n1 + n2;
                    System.out.println(" result: "+result);
                    break;
                }
                case '-':{
                    result = n1 - n2;
                    System.out.println(" result: "+result);
                    break;
                }case '*':{
                    result = n1 * n2;
                    System.out.println(" result: "+result);
                    break;
                }case '/':{
                    result = n1 / n2;
                    System.out.println(" result: "+result);
                    break;
                }
                case '%':{
                    result = n1 % n2;
                    System.out.println(" result: "+result);
                    break;
                }
                default:{
                    System.out.println(" Enter correct character ");
                    break;
                }
            }
            System.out.println(" enter 1 if you want to do calculation again 0 to cancel programme");
            choice = sc.nextInt();
            if(choice == 0)
                break;
        }
    }
}

