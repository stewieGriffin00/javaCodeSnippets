
class MultiThreading{
    public static void main(String[] args){
        Database ob1 = new Database();
        Database ob2 = new Database();
        Thread t1 = new Thread(ob1,"T-1");
        Thread t2 = new Thread(ob1,"T-2");
        t1.start();
        t2.start();
        Thread t3 = new Thread(ob2,"T-3");
        Thread t4 = new Thread(ob2,"T-4");
        t3.start();
        t4.start();
    }
}

class Database extends Thread {
    @Override
    public synchronized void run(){
        for(int i=0; i<50; i++){
            if(i==0 || i == 49){
                System.out.println(Thread.currentThread().getName()+"---------------------------------");
            }
            else{
                System.out.println(Thread.currentThread().getName()+" "+ i );
            }
        }
    }
}
/*     ob1 - t1, t2 
       ob2 - t3, t4
    here the ob is the objects of User defined class with run method and t1, t2, t3 and t4 are 
    instances of thread class. 
        since t1 and t2 have the same object ob1 they cannot access the run() method simultaneously 
        same applies to t3 and t4 cause theyhave the same object which is the key to access, the
        run method.

        But t1 and t3 or t4 and t2 and t3 or t4 can access the method at simultaneously.  
        In a nutshell, Thread objects which have same keys cannot access the method simultaneously.
 */