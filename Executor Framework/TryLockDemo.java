import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class TryLockDemo {
    
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();
    
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(() -> {
            try {
                if (lock1.tryLock(100, TimeUnit.MILLISECONDS)) {
                    System.out.println("Thread 1: Got lock1");
                    
                    Thread.sleep(50);
                    
                    if (lock2.tryLock(100, TimeUnit.MILLISECONDS)) {
                        System.out.println("Thread 1: Got lock2");
                        lock2.unlock();
                    } else {
                        System.out.println("Thread 1: Couldn't get lock2, backing off");
                    }
                    lock1.unlock();
                }
            } catch (InterruptedException e) {}
        });
        
        // Similar for thread2...
        
        thread1.start();
    }
}