
import java.util.concurrent.CompletableFuture;

public class sample {

    public static void main(String[] args) {

        CompletableFuture<String> cl1 = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                System.out.println(e);

            }
            return "java [1]";
        });

        CompletableFuture<Integer> cl2 = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(e);

            }
            return 100;
        });

        CompletableFuture<String> cl3 = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(15_000);

            } catch (InterruptedException e) {
                System.out.println(e);

            }
            return " spring boot[3]";
        });

        CompletableFuture<Object> anyOfFuture= CompletableFuture.anyOf(cl1, cl2, cl3);
        Object j  = anyOfFuture.join();
        System.out.println("programme is finished "+ j);
        

        
    }
}
