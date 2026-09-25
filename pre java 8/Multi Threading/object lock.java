class MultiThreading{
    public static void main(String[] args){
        Database ob1 = new Database();
        Thread t1 = new Thread(ob1,"T-1");
        Thread t2 = new Thread(ob1,"T-2");
        Thread t3 = new Thread(ob1,"T-3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Database extends Thread {
    @Override
    public synchronized void run(){
        for(int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+" "+ i );
        }
    }
}

