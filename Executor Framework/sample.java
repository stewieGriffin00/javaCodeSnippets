
import java.util.Arrays;
import java.util.Scanner;

class MyClass {

    public static void main(String[] args) {
        // Random r= new Random();

        // int[] arr= new int[r.nextInt(5, 100)];
        // for(int i= 0; i< arr.length; i++){
        //     arr[i]= r.nextInt(1, 100);
        // }
        int[] arr = {5, 1, 4, 3, 2};  // 
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) { // 1
            int key = arr[i];       //  1
            int j = i - 1; // 0

            while (j >= 0 && arr[j] > key) { // 5 > 1
                arr[j + 1] = arr[j];  //  5, 5, 4, 3, 2
                j--; // 
            }

            arr[j + 1] = key;  // 1
            // System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));
            
        Scanner sc= new Scanner();
    }
}
