// static synchronized
// it is used for applying class level lock on a method. 
// if we use just the synchronized word on a method the thread can aquire the lock on that object. so any other thread that uses the object to run cannot execute unless other threads using that object release their lock.
// which can be solved by providing all threads their own objects so that even if the method is synchronized it could be executed by other threads even if it is a  synchronized method.
// because the syncrhonized reserves that one instance of the class not all instances. 
// so if we want no object of the class to execute the method in synchronized then we use static syncrhonized keyword in the method.
// just like static variables is common to the objects of whole class. i.e it stays same for all objects. similarly the static synchronized method applies class level lock of the method which applies to all instances  of that object. 
// so even if other threads use different instances of the same class. the method stays unusable until other threads release it after their execution .


class PQ{
    public static void main(String[] args) {

        Basic b1= new Basic();
        Basic b2= new Basic();
        Basic b3= new Basic();
        Basic b4= new Basic();
        Basic b5= new Basic();


        Runnable r1= ()-> b1.methodA();
        Thread t1= new Thread(r1, "T-1");
        t1.start();

        Runnable r2= ()-> b2.methodA();
        Thread t2= new Thread(r2, "T-2");
        t2.start();
        
        Runnable r3= ()-> b3.methodA();
        Thread t3= new Thread(r3, "T-3");
        t3.start();
        
        Runnable r4= ()-> b4.methodA();
        Thread t4= new Thread(r4, "T-4");
        t4.start();

        Runnable r5= ()-> b5.methodA();
        Thread t5= new Thread(r5, "T-5");
        t5.start();
    }
}

class Basic{
    //  void methodA(){
    static synchronized void methodA(){
        System.out.println("\n");
        for (int i=1; i<=100; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
        }
        System.out.println("\n");
    }
}
