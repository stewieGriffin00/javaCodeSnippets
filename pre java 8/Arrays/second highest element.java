import java.util.Arrays;
class Database{
    public static void main(String[] args){
        System.out.println(" sorting arrays ");
        int[] arr1 = {3,7,1}; // 5
        int temp = 0;
        for(int i=0; i< arr1.length-1; i++){
            for(int j=0 ; j< arr1.length-1; j++){
                if(arr1[j]>arr1[j+1]){
                    temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp; 
                }
            }
        }
        System.out.println(" second highest element: "+ arr1[arr1.length-2]);
    }
}

