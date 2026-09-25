class MultiThreading{
    public static void main(String[] args){
        System.out.println(" main thread: "+Thread.currentThread().getName());
        Game ob1 = new Game();
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob1);
        t1.run();
        t2.run();

    }
}

class Game implements Runnable{
    @Override
    public void run(){
            for(int i=0; i<10; i++){
                System.out.println(" i: "+i+" "+Thread.currentThread().getName());
            }
    }
}
//  if we use .run() method instead of .start()  method we can't use the multi threading
// that is why we get 'main' as thread name instead of thread-0 or anything else
// also we used two objects t1 and t2 to invoke the run method but we get only one method
// because if we invoke .run() method JVM considers it as normal method than multithreading method  
