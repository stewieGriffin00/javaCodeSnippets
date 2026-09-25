import java.util.Random;
import java.util.Arrays;
class DataBase{
    public static void main(String[] args){
        System.out.println(" ");
        Random r = new Random();
    //    int num = r.nextInt(1,101);
       int[] arr = new int[1000];
       for(int i= 0; i<1000; i++){
        arr[i] = r.nextInt(1,1001);
       }
       int arr1[] = Arrays.copyOf(arr,arr.length); 
       int arr2[] = Arrays.copyOf(arr,arr.length); 
    //    int arr3[] = Arrays.copyOf(arr,arr.length); 
       bubble(arr1);
       selection(arr2);
    }
    static void bubble(int[] arr1){
        long start, end;
        int temp, count =0;
        start = System.nanoTime();
        for(int j=0; j<arr1.length-1; j++){
            for(int i= 0; i<arr1.length-1 ; i++){
                if(arr1[i] < arr1[i+1]){
                    temp = arr1[i]; 
                    arr1[i] = arr1[i+1];
                    arr1[i+1] = temp;
                    count++;  
                }
            }
        }
        end = System.nanoTime();
        // System.out.println(" bubble sort time taken: "+(end-start));
        System.out.println(" bubble: "+count);

    }
    static void selection(int[] arr){
        long start, end;
        start = System.nanoTime();
        int count= 0;
        for(int i=0; i< arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                    count++;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        end = System.nanoTime();
        // System.out.println(" selection sort time taken: "+(end-start));
        System.out.println(" selction: "+count);
    }
}
