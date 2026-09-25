
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Sample {
    public static void main(String[] args) {
       ExecutorService execServ1= Executors.newCachedThreadPool();

       for (int i= 1; i<4; i++){
        execServ1.execute( ()->{
            for (int j= 1; j<10; j++) { 
                    System.out.println(j+ " "+ Thread.currentThread().getName());
                }
            }
        );
       }
       execServ1.shutdown();

       // cached thread pool creates just the right amount of threads required for your task 
    
    }
}




