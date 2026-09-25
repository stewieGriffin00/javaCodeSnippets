import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENter something ");
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        for(int i =0 ; i<= inputArr.length-1; i++){
            System.out.println(inputArr[i]);
        }
        System.out.println(" enter what you want to search ");
        String searchWord = sc.next();
        if(input.contains(searchWord)){
            System.out.println(input+" contains "+searchWord);
        }
        else{
            System.out.println(input+" not contains "+searchWord);
        }
        // System.out.println((input.contains(searchWord))?" contains ": " not contains");
        
    }
}
