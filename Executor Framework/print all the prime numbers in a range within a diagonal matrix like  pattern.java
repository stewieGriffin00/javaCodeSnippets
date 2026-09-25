
class Main {

    public static void main(String[] args) {
        System.out.println("\n\n");

        int n = 6;
        int count = 0;
        int primeNumberCount = 0;
        for (int i = 2; i <= n; i++) {
            count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (i == j && count == 1) {
                    System.out.println(i + " is prime ");
                    primeNumberCount++;
                }
            }
        }
        System.out.println("\n\n");

        System.out.println("from one to " + n + " " + primeNumberCount + ": prime numbers");

        count = 0;
        int lineNumber = primeNumberCount;
        for (int j = 2; j <= n; j++) {
            count = 0;
            for (int k = 2; k <= j; k++) {
                if (j != k && j % k == 0) {
                    count++;
                }
                if (count == 1 && j == k) {
                  
                    for (int a = 1; a <= lineNumber; a++) {
                        for (int b = 1; b <= lineNumber; b++) {
                            if (a == b) {
                                System.out.print(a);
                            } else {
                                System.out.print(0);
                            }
                            if (b != 5) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }

                }
            }
        }
    }
}
