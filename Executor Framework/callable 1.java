// Create a Callable that returns your name as a String. Submit it and print the result.

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Sample{
    public static void main(String[] args){
        MyTask mytask= new MyTask();

        ExecutorService execServ= Executors.newFixedThreadPool(1);

        try {
            Future<String> future= execServ.submit(mytask);
            // System.out.println(future.get());
            System.out.println(future);
        }

        catch (Exception e) {
            System.out.println(e);
        }
        execServ.shutdown();
    }
}

class MyTask implements Callable<String>{
    
    @Override
    public String call() throws Exception {
        return "Name";
    }
}

