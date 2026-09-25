import java.util.Arrays;
// with both the methods when array starts from 0 and also when array starts with one
class Sorting{
    public static void main(String[] args){
        System.out.println(" Cyclic sort");
        int[] arr = {3,5,1,2,7,4,6,9,8,12,11,10}; // length: 12
        // int[] arr = {0,3,5,1,2,7,4,6,9,8,12,11,10}; 
        int temp=0;
        System.out.println(" before sort "+Arrays.toString(arr));
        for(int i= 0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++){
                if(temp< arr[i]){
                    temp = arr[i];
                }
            }
            if(temp == arr.length){
                if(arr[i] != i+1){
                    temp = arr[i];
                    arr[i] = arr[temp-1];
                    arr[temp-1] = temp;
                }
            }
            else{
                if(arr[i] != i){
                    temp = arr[i]; 
                    arr[i] = arr[temp]; 
                    arr[temp] = temp;
                }
            }
        }
        System.out.println(" after sort "+Arrays.toString(arr));
    }
}
