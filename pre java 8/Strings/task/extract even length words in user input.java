import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENter a Sentence ");
        String userSentence  = sc.nextLine();
        String[] inputArr = userSentence.split(" ");
        String arrayElement = "";
        for(int i = 0; i<= inputArr.length-1; i++){
            arrayElement = inputArr[i];
            if((arrayElement.length()) %2 == 0){
                System.out.println(arrayElement);
            }
        }
    }
}
