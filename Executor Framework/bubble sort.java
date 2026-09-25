// bubble sort  

import java.util.Arrays;

class MyClass{
    public static void main(String[] ars){
        int[] arr= {5, 1, 4, 3, 2}; // L: 5 
        int temp= 0;

        System.out.println(Arrays.toString(arr));

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

 


