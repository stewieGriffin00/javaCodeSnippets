import java.util.Arrays;
class Database{
    public static void main(String[] args){
        System.out.println(" merging two arrays ");
        int[] arr1 = {1,2,3,4,5}; // 5
        int[] arr2 = {6,7,8,9,10}; // 5

        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i= 0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for(int i=0; i< arr2.length; i++){
            arr3[arr1.length+i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}

