import java.util.Arrays;
import java.util.Scanner;

class Jaffer{
    public static void main(String[] args){
        int[] arr ={20, 13, 40, 90, 44};
        System.out.println("array: " +Arrays.toString(arr));
        int times = 0;
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a number");

        times= sc.nextInt();

        
        for(int j=0; j< times; j++){

            int m= arr[0];
            for(int i=1; i<arr.length; i++){
                arr[i-1]= arr[i];
            }
            arr[arr.length-1] = m;

        }

        System.out.println("array rotated : "+ times +" times "+Arrays.toString(arr));

    }
}