import java.util.Arrays;
class SelectionSort{
    public static void main(String[] args){
        int[] arr= {3,4,2,1};
        System.out.println(" before sort: "+Arrays.toString(arr));
        for(int i=0; i< arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
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

