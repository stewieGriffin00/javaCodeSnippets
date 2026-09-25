import java.util.Arrays;
class Sorting{
    public static void main(String[] args){
      int[] arr = {5, 1, 4, 2, 3};
      System.out.println(" array before sorting: "+Arrays.toString(arr));
      for(int i= 0; i< arr.length-1; i++){
        int min = i;
        for(int j= i+1; j<arr.length; j++){
          if(arr[j] > arr[min]){
            min = j;
          }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }
      }
      System.out.println(" sorted array: "+Arrays.toString(arr));
    }
}