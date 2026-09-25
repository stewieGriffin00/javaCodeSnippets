
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1,1,1,1,3,5,0,0,6,7,4,7,0}; 
        int temp = 0;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[j] != 0) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
