// 
import java.util.Arrays;
class Database{
    public static void main(String[] args){
        int[] arr1 = {1,4,2,3,5}; // 10
        int temp= 0 , count = 0;
        System.out.println(" before sort "+Arrays.toString(arr1));
        for(int j=0; j<arr1.length-1; j++){
            for(int i= 0; i<arr1.length-1 ; i++){
                if(arr1[i] < arr1[i+1]){
                    count++;
                    temp = arr1[i]; 
                    arr1[i] = arr1[i+1];
                    arr1[i+1] = temp;  
                }
            }
            if(count == 0){
                System.out.println(" array is sorted already ");
            }
        }
        System.out.println(" after sort "+Arrays.toString(arr1));
    }
}
/*
    1 4 2 3 5
    4 1 2 3 5
    4 2 1 3 5
    4 2 3 1 5
    4 2 3 5 1
    4 3 2 5 1
    4 3 5 2 1
    4 5 3 2 1
    5 4 3 2 1
 */