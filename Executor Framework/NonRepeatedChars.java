public class NonRepeatedChars {

    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c', 'a', 'd', 'b', 'e'};

        System.out.println("Non-repeated characters:");

        for (int i = 0; i < arr.length; i++) {
            boolean isRepeated = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                System.out.println(arr[i]);
            }
        }
    }
}


