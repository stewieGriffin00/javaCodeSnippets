
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class sample {

    public static void main(String[] args) {
        ReentrantLock obj1 = new ReentrantLock();
        ReentrantLock obj2 = new ReentrantLock();

        Runnable r1 = () -> {

            try {
                if (obj1.tryLock(1_000, TimeUnit.MILLISECONDS)) {
                    System.out.println("acquired lock on A resource "+Thread.currentThread().getName());
                    if (obj2.tryLock(5_000, TimeUnit.MILLISECONDS)) {
                        System.out.println("acquired lock on B resource "+Thread.currentThread().getName());

                        obj2.unlock();
                        obj1.unlock();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupted();

            }
        };

        Runnable r2 = () -> {
            try {
                if (obj2.tryLock(1_000, TimeUnit.MILLISECONDS)) {
                    System.out.println("acquired lock on B resource "+Thread.currentThread().getName());
                    if (obj1.tryLock(5_000, TimeUnit.MILLISECONDS)) {
                        System.out.println("acquired lock on A resource "+Thread.currentThread().getName() );
                        obj1.unlock();
                        obj2.unlock();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupted();

            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupted();
        }

    }
}
