import java.util.concurrent.CompletableFuture;

public class sample {

    public static void main(String[] args) {

        CompletableFuture<String> cf1= CompletableFuture.supplyAsync(()-> "hello");
        
        CompletableFuture<Integer> cf2= CompletableFuture.supplyAsync(()-> 100);
        
        cf1.thenCombine(cf2, (s, i)->"string: "+s+"\ni:"+i).thenAccept(n-> System.out.println(n));
        
        // CompletableFuture<String> cf3= cf1.thenCombine(cf2, (s, i)->" string: "+s+"\ni:"+i);
        
        // try{
        //     System.out.println(cf3.get());

        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }


        
        //Notes: 
        // we dont need to invoke the get methid to get the value returned by the completable future
        // we can just chain a thenAccept at end of the pipe line so that we could easily accpet 
        // the value and perform operations on it 
        

        // Either chain the thenAccpet method to just retrieve the value from the completable future and 
        // then print it inside the task itself. 
        // otherwise assign the returned object to a completable future reference and then invoke 
        // .get() method to print it. but this will block the main thread. WHIch means all the further 
        // operations of the main thread will be suspended until the thread is completed  
        
    }
}
