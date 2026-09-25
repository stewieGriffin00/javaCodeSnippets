import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Sample {
    public static void main(String[] args) {
        
        ExecutorService ob1= Executors.newFixedThreadPool(4);

        for (int i= 1; i<= 30; i++) {
            int j= i;
            ob1.execute(()->{
                System.out.println(j+" "+Thread.currentThread().getName());
            });
        }
        
        ob1.shutdown(); 
        // shutdown method exits the programme. IF we didn't invoke the sutdown method then the programme keep runnin even though there is no statements to be executed. If we run this programme in CMD after all the tasks is completed the cmd will not close it it will keep standing by until we click ctrl + C to kill the process that is why invoking the shutDown() method is mandatory.
        
        // ob1.shutdownNow(); 
        // this method doesn't wait until the tasks are completed it shutsdown the process immediately
    }
}


