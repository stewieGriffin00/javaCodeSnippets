// when synchronized keyword is used on a method the method can only used by one thread no other thread can execute the method until the thread finsihes its exeution. 
// so which thread gets to execute first? it is determined by who acquires the lock first. 
//  if thread 1 gets the lock first it won't let other threads use the method until it finishes its execution.
// if we didnot use the synchronized key word in the below programme then all threads would acquire lock on the object and all of themm would be able to execute the method simultaneously.


class PQ{
    public static void main(String[] args) {

        Basic b= new Basic();

        Runnable r1= ()-> b.methodA();
        // the above statement is just a task meaning it is just an operation we can create just one of it and pass it to multiple threads to run it simultaneously. Instead of just writing the task again and again if it is the same thing in all threads
        
        Thread t1= new Thread(r1, "T-1");
        t1.start();

        Thread t2= new Thread(r1, "T-2");
        t2.start();
        
        Thread t3= new Thread(r1, "T-3");
        t3.start();
        
        Thread t4= new Thread(r1, "T-4");
        t4.start();

        Thread t5= new Thread(r1, "T-5");
        t5.start();
    }
}

class Basic{
     void methodA(){
    // synchronized void methodA(){
        System.out.println("\n");
        for (int i=1; i<=100; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
        }
        System.out.println("\n");
    }
}
