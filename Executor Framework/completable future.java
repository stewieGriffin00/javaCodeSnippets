



class Jaffer2{
    public static void main(String[] args) throws InterruptedException{
        // CompletableFuture<String> future= CompletableFuture.completedFuture("hello");
        
        // CompletableFuture<String> future2= CompletableFuture.supplyAsync(()->{
        //     try {
        //         Thread.sleep(2000);
        //     } catch (InterruptedException ex) {
        //         Thread.currentThread().interrupt();
        //     }
        //     return "thread is completed";
        // });

        
        // CompletableFuture<Void> future3= CompletableFuture.runAsync(()->{
        //     System.out.println("run async is completed");
        // });

        // Runnable r1= ()->{

        //     int sum= 0;
        //     for (int i=0; i<100; i++) {
        //         sum +=i;
        //     }

        //     System.out.println("sum value: "+sum);
        // };

        // CompletableFuture<Void> future4= CompletableFuture.runAsync(r1);

        
        // future4.join();

        // CompletableFuture<String> future5= CompletableFuture.supplyAsync(()->{
        //     try {
        //         Thread.sleep(2000);
                
        //     } catch (InterruptedException e) {
        //         Thread.currentThread().interrupt();
        //     }
        //     System.out.println("thread is completed");
        //     return "skibidi";
        // });

        // CompletableFuture<Integer> future6= CompletableFuture.supplyAsync(()->{
        //     int j= 0;
        //     for(int i=0; i<100; i++){
        //         j += i;
        //     }

        //     return j;
        // }).thenApply(n-> n*2);


        // try {
        //     System.out.println(future6.get());
        // } 
        // catch ( ExecutionException e) {
        //     e.printStackTrace();
        // }
    }
}
