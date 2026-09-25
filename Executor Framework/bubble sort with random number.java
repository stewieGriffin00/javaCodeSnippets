// bubble sort  

import java.util.Arrays;
import java.util.Random;

class MyClass{
    public static void main(String[] ars){
        Random m= new Random();
        // System.out.println(m.nextInt(1, 10));

        int[] arr= new int[m.nextInt(5, 101)];

        for (int i=0; i< arr.length; i++) {
            arr[i]= m.nextInt(1, 101);
        }

        System.out.println(Arrays.toString(arr));


        int temp= 0;

        for(int i=0; i< arr.length - 1; i++){
            for(int j= i+1; j< arr.length; j++){
                if(arr[i]< arr[j]){
                    temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
                
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

 


