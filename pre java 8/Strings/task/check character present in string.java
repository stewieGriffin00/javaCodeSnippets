import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        System.out.println(" enter one word without space ");
        String input = new Scanner(System.in).next();
        System.out.println(" user entered: "+ input);
        System.out.println(" enter one character ");
        char charInput = new Scanner(System.in).next().charAt(0);
        if(input.contains(charInput+"")){
            System.out.println(input+" contains "+charInput);
        }
        else{
            System.out.println(input+" not contains "+charInput);
        }
    }
}
