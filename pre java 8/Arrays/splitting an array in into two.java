import java.util.Arrays;
class Database{
    public static void main(String[] args){
        System.out.println(" splitting an array in into two ");
        int[] arr1 = {1,44,33,2,5,6,7,4,3,99};
        int[] arr2 = new int[arr1.length/2];
        int[] arr3 = new int[arr1.length/2];
        for(int i=0 ; i< arr1.length/2; i++){
            arr2[i] = arr1[i];
            arr3[i] = arr1[(arr1.length/2)+i];  
        }
        
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}