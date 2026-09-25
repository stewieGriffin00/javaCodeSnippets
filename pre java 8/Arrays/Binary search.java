import java.util.Scanner;
import java.util.Arrays;
class DataBase{
    public static void main(String[] args){
        System.out.println(" ");
        int[] arr = {1,3,4,6,7,9,11,13,20}; // length: 9 index: 0 to 8
                 //  0 1 2 3 4 5  6  7   8
        System.out.println(Arrays.toString(arr));
        int s= 0, e= arr.length-1;
        int m= (s+e)/2; // index: 4 element: 7
        System.out.println(" enter number to find ");
        int user=new Scanner(System.in).nextInt();
        for(int i=0; i<arr.length; i++){
            m= (s+e)/2;
            if(user==arr[m]){
                System.out.println(" your number is at index: "+m);
                return;
            }
            else if(user>arr[m]){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        System.out.println(" not found. ");
    }
}

