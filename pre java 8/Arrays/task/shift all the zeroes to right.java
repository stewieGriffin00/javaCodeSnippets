//  shift all the zeroes to right
import java.util.Arrays;
class Database{
    public static void main(String[] args){
        int[] arr1 = {0,0,0,2,0,5,0,6,0,7,0,3,2,0,2,0};
        int[] arrDuplicate = new int[arr1.length];
        int s =0, e = arr1.length-1;
        for(int i= 0; i< arr1.length; i++){
            if(arr1[i] > 0){
                arrDuplicate[s] = arr1[i];
                s++;
            }
            else{
                arrDuplicate[e] = arr1[i];
                e--;
            }
        }
        System.out.println(" Old array: "+Arrays.toString(arr1));
        System.out.println("\n new array: "+Arrays.toString(arrDuplicate));
    }
}
