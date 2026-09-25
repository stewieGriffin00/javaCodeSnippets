// System.out.println();
import java.util.Scanner;
class Generics{
    public static void main(String[] args){
        Calculator<Number> ob = new Calculator<>();
        switch(menu()){
            case 1:
                System.out.println("you entered 1");
                ob.addition();
                break;
            case 2:
                System.out.println("you enter 2");
                ob.subtract();
                break;

            case 3:
                System.out.println("you enter 3");
                ob.multiply();
                break;
                
            case 4:
                System.out.println("you enter 4");
                ob.division();
                break;
            default:
                System.out.println("wrong number");
                break;
        }

    }
    public static int menu(){
        System.out.println("\t 1. addition \n\t 2. subtraction \n\t 3. Multiply \n\t 4. Division");
        return new Scanner(System.in).nextInt();
    }
}

class Calculator <T extends Number>{
    Scanner sc;
    Double a,b;
    void addition(){
        System.out.println("enter first number");
        Double x =  sc.nextDouble();
        System.out.println("enter second number");
        Double y =  sc.nextDouble();
        Double d = x.doubleValue() + y.doubleValue();
        System.out.println(d);
    }
    void subtract(){
        System.out.println("enter first number");
        Double x =  sc.nextDouble();
        System.out.println("enter second number");
        Double y =  sc.nextDouble();
        Double d = x.doubleValue() + y.doubleValue();
        System.out.println(d);

    }

    void multiply(){
        System.out.println("enter first number");
        Double x =  sc.nextDouble();
        System.out.println("enter second number");
        Double y =  sc.nextDouble();
        Double d = x.doubleValue() + y.doubleValue();
        System.out.println(d);

    }
    void division(){
        System.out.println("enter first number");
        Double x =  sc.nextDouble();
        System.out.println("enter second number");
        Double y =  sc.nextDouble();
        Double d = x.doubleValue() + y.doubleValue();
        System.out.println(d);

    }
}

