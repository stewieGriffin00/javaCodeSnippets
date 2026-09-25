import java.util.Arrays;
class SplitArray{
    public static void main(String[] args){
        // System.out.println(" Selection sort");
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = new int[arr.length/2];
        int[] arr2 = new int[arr.length-(arr.length/2)];
        int i = 0, j = 0;
        while(i<arr.length){
            if(i<arr1.length){
                arr1[i] = arr[i]; 
            }
            else{
                arr2[j++] = arr[i];
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
