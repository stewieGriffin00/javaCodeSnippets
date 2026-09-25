import java.util.Arrays;
class Sorting{
    public static void main(String[] args){
      int[] arr = {5, 4, 3, 2, 1};
      System.out.println(" array before sorting: "+Arrays.toString(arr));
      int temp = 0, count=0;
      for(int i=0; i< arr.length; i++){
        for(int j=0; j<arr.length; j++){
          if(arr[i] > arr[j]){
            count++;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            System.out.println(Arrays.toString(arr));
          }
        }
      }
      System.out.println(" sorted array: "+Arrays.toString(arr)+"count: "+count);
    }
}