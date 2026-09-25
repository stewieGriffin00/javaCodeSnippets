import java.util.Arrays;

class MyClass{
    public static void main(String[] args){
        int[] arr= {5, 1, 4, 2, 3};
         // 1, 5, 4, 2, 3
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