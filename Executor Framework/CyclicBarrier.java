// in cyclic barrier we wait in each task for all threads running simulatenously to arrive at a common point and not proceed further until it did. 
// after that the programme proceeds further. the number in cyclic barrier to denote how to many threads to look for to stop at the meeting point is reset after all arrive at it
// so in this example we set it to 3. so only after three threads arrived at that point any thing after that point will be alloweed to execute. 
// if the number in cyclic barrieer and the number of threads started mismatched we will have to wait forever for the programme to finish executing or manually use Ctrl+C to Kill the process in Command prompt


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


class CyclicBarriers{
    public static void main(String[] args) throws InterruptedException{

        CyclicBarrier cb= new CyclicBarrier(3);

        Runnable r1= ()->{
            System.out.println(Thread.currentThread().getName()+" started");
            try {
                Thread.sleep(3000);
                cb.await();
                System.out.println(Thread.currentThread().getName()+" middle");
                Thread.sleep(3000);
                cb.await();
                System.out.println(Thread.currentThread().getName()+" ended");
                
            } catch (BrokenBarrierException | InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        };

        Thread t1= new Thread(r1, "T-1");
        Thread t2= new Thread(r1, "T-2");
        Thread t3= new Thread(r1, "T-3");

        t1.start();
        t2.start();
        t3.start();

    }
}


