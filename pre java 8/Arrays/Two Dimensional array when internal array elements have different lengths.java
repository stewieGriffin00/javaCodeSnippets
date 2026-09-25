// 
import java.util.Arrays;
class Database{
    public static void main(String[] args){
        int[][] arr1 = {{1,2}, {3,4,5}, {6,7,8,9}}; // arr[].length = 3
        // arr[0],[1],[2].length = 2, 3, 4
        
        System.out.println(" Two Dimensional array when internal array elements have different lengths");
        for(int i=0; i<arr1.length; i++){
            for(int j= 0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
/*
   
 */