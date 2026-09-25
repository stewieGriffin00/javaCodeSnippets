// Count down latch is a class that stores a variable value which is decremented every time the operation is executed and the method await() is used for preventing the main thread from executing further statements until the Countdown is decreased to Zero
// in this below programme we set the counter to 3. 
// then every time a new thread handles the operation we decrement the variable value
// as you can the statements below the await method invoking line is not executed until the countdown is reduced to zero  
// so if we set the counter as 10 and only called like 5 threads then the programme will wait forever to proceed further. then you will have to kill the process in Command prompt using ctrl+ C

import java.util.concurrent.CountDownLatch;

class PQ{
    public static void main(String[] args) {
        CountDownLatch cl= new CountDownLatch(10);

        Runnable r1= ()->{
            System.out.println(Thread.currentThread().getName()+" started");
            cl.countDown();
        };

        Thread t1= new Thread(r1, "T-1");
        Thread t2= new Thread(r1, "T-2");
        Thread t3= new Thread(r1, "T-3");

        t1.start();
        t2.start();
        t3.start();

        
        try {
            cl.await();
            
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println("All threads finished executing");
    }
}


