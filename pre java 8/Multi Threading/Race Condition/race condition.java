// import java.util.concurrent.atomic.AtomicInteger; 
class Multithreading{
    public static void main(String[] args){
        A a = new A();
        B b = new B(a);
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        System.out.println(a.count); // expected 2,00,000 but we will get less because of 
        // race condition. 
    }
}

class A{
    // volatile int count;
    AtomicInteger count = new AtomicInteger();
    void countIncrease(){
        // count++;
        count.incrementAndGet();
    }
    // synchronized void countIncrease(){
    //     count++;
    // }
}

class B extends Thread{
    A a;
    B(A a){
        this.a = a;
    }
    public void run(){
        for(int i=0; i<1_00_000; i++){
            a.countIncrease();
        }
    }
}
/*  the count variable is made into an Atomic Integer imported from the java.util.concurrent.
     .atomic.AtomicInteger
     if a variable is atomic varible it is in sync 

    when we used 
 */