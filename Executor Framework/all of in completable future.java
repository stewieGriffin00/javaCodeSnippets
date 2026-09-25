
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class sample {

    public static void main(String[] args) {

        CompletableFuture<String> cl1 = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(e);

            }
            return "first string";
        });

        CompletableFuture<String> cl2 = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                System.out.println(e);

            }
            return "second string";
        });

        CompletableFuture<String> cl3 = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                System.out.println(e);

            }
            return " third string";
        });

        List<CompletableFuture<String>> l1 = new ArrayList<>();

        l1.add(cl1);
        l1.add(cl2);
        l1.add(cl3);

        CompletableFuture<String>[] f = l1.toArray(new CompletableFuture[0]);
        CompletableFuture<Void> cl4 = CompletableFuture.allOf(f);

        System.out.println("\n \n \n \n \n");

        // for (int i = 0; i < 5; i++) {
        //     try {
        //         Thread.sleep(1000);

        //     } catch (InterruptedException e) {
        //         System.out.println(e);

        //     }
        //     System.out.println((i + 1) + " seconds passed");
        // }

        cl4.join();

        System.out.println("after all of join ");

        try {
            System.out.println(cl1.get());
            System.out.println(cl2.get());
            System.out.println(cl3.get());

        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e);
        }

        System.out.println("programme's last line asyncc halted because of the join method ");
    }
}
