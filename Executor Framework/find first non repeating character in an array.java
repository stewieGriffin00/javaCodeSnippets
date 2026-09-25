
import java.util.Arrays;

class One {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 1, 1, 2, 3};
        System.out.println("array: " + Arrays.toString(arr));
        int count = 0;
        boolean foundNotRepeatingCharacter = false;

        for (int i = 0; i < arr.length; i++) {

            if (foundNotRepeatingCharacter) {
                break;
            }

            count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j]) { // i: 0 j: 1
                    count++;

                }

                if (count == 0 && j == arr.length - 1) {
                    System.out.println("not repeating character: " + arr[i]);
                    foundNotRepeatingCharacter = true;
                }
            }

            if (foundNotRepeatingCharacter == false && i == arr.length - 1) {
                System.out.println("first not repeating character: -1");
            }
        }
    }
}
