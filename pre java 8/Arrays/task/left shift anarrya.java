//   
// public static void main(String[] args)
// System.out.println();
import java.util.Arrays;
class Database{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int [] arr2= new int[arr1.length];
        int shift = 2;
        for(int i= 0; i< arr1.length; i++){
            if(i> (shift-1)){
                arr2[(arr1.length-shift)+1] = arr1[(arr1.length)];
            }
            else{
                arr2[] = arr1[];
            }
        }
    }
}
