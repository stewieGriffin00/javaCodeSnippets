class MultiThreading{
    public static void main(String[] args){
        Database ob1 = new Database();
        Database ob2 = new Database();
        Thread t2 = new Thread(ob1);
        Thread t1 = new Thread(ob1);
        t1.start();
        t2.start();
    }
}

class Database extends Thread {
    @Override
    public void run(){
            synchronized(this){
        for(int i=0; i<50; i++){
                    System.out.println(Thread.currentThread().getName()+" sync "+i);
            }
                // System.out.println(Thread.currentThread().getName()+" "+ i );
            
        }
    }
}

