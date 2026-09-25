//  find element
import java.util.Scanner;
class Database{
    public static void main(String[] args){
        int[] arr1 = {1,2,5,6,4,3,2,8,7,8,6,5,4,7,2,2,12,5,7,8,9,6,4,3,2,4,7};
        System.out.println(" enter a number ");
        int m = new Scanner(System.in).nextInt();
        for(int i=0; i< arr1.length; i++){
            if(arr1[i] == m){
                System.out.println(" present index: "+i);
                return;
            }
        }
        System.out.println(" not present -1 ");
    }
}
