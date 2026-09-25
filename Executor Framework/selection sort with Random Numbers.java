import java.util.Arrays;
import java.util.Random;

class MyClass{
    public static void main(String[] args){
        Random r= new Random();

        int[] arr= new int[r.nextInt(5, 100)];

        for(int i= 0; i< arr.length; i++){
            arr[i]= r.nextInt(1, 100);
        }


        int minIndex= 0;
        int temp= 0;

        System.out.println(Arrays.toString(arr));
        
        for(int i=0; i< arr.length-1 ; i++){ 
            minIndex= i; 

            for (int j= i+1; j< arr.length; j++) { 
                if (arr[j] < arr[minIndex]) {  
                    minIndex= j; 
                }
            }

            temp= arr[minIndex]; 
            arr[minIndex]= arr[i];
            arr[i]= temp;
        }   
        System.out.println(Arrays.toString(arr));

    }
}