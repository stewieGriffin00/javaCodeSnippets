
// class Jaffer3{
//     public static void main(String[] args) throws InterruptedException{
       
        
//     }
// }

import java.util.concurrent.CompletableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllOfDemo {
    public static void main(String[] args) {
        
        // Create multiple futures
        List<CompletableFuture<String>> futures = Arrays.asList(
            fetchData("Service A", 2000),
            fetchData("Service B", 3000),
            fetchData("Service C", 1000),
            fetchData("Service D", 2500)
        );
        
        // Wait for ALL to complete
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(
            futures.toArray(new CompletableFuture[0])
        );
        
        System.out.println("Waiting for all services...");
        
        // After all complete, collect results
        CompletableFuture<List<String>> allResults = allFutures.thenApply(v -> 
            futures.stream()
                .map(CompletableFuture::join)  // Now join won't block
                .collect(Collectors.toList())
        );
        
        // Get all results
        List<String> results = allResults.join();
        System.out.println("\nAll results:");
        results.forEach(System.out::println);
    }
    
    private static CompletableFuture<String> fetchData(String service, int ms) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(ms);
            return service + " responded in " + ms + "ms";
        });
    }
    
    private static void sleep(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) {}
    }
}
