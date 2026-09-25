// System.out.println();
import java.util.Arrays;
class Database{
    public static void main(String[] args){
        int[][] arr1 = {{1,2}, {3,4,5}, {6,7,8,9}};
        int[] ar2 = {1,2,3,4,5};
        int[] arr3 = {0,9,8,7};
        System.out.println(" array utility methods ");
        int[] ar3 = Arrays.copyOf(ar2, ar2.length); // deep copy
        // System.out.println(" copy of method "+Arrays.toString(ar3)); 
        // System.out.println(Arrays.deepToString(arr1));
        // Arrays.fill(arr3,10);
        // System.out.println(Arrays.toString(arr3));
        // int [] arr4 = Arrays.copyOfRange(ar2,1,3);
        // System.out.println(Arrays.toString(arr4));
        // int [] arr5 = Arrays.copyOf(ar2, ar2.length);
        // System.out.println(Arrays.equals(arr5,ar2));     
        int[][] arr6 = Arrays.copyOf(arr1, arr1.length);
    }
}
/*
   
 */