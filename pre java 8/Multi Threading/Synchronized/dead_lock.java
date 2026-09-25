class DeadLock{
    public static void main(String[] args){
        Buffer b1 = new Buffer();
        Buffer b2 = new Buffer();

        Thread1 t1 = new Thread1(b1,b2,"T-1");
        Thread1 t2 = new Thread1(b1,b2,"T-2");
        t1.start();
        t2.start();
    } 
}

class Util{
    static void sl(int m){
        try{
            Thread.sleep(m);
        }
        catch(InterruptedException iE){
            System.out.println("InterruptedException \n class: Util \n method: sl");
        }
    }
}

class Thread2 extends Thread{
    Buffer b1,b2;
    Thread2(Buffer b1, Buffer b2, String thread_name){
        super(thread_name);
        this.b1 = b1;
        this.b2 = b2;
    }
    @Override
    public void run(){
        b2.test1(b1);
    }
}

class Thread1 extends Thread{
    Buffer b1,b2;
    Thread1(Buffer b1, Buffer b2,String thread_name){
        super(thread_name);
        this.b1 = b1;
        this.b2 = b2;
    }
    @Override
    public void run(){
        b1.test1(b2);
    }
}

class Buffer{
    synchronized void test1(Buffer b){
        b.test2();
    }
    synchronized void test2(){
        System.out.println("Buffer(C) > test(M)  "+ Thread.currentThread().getName());
    }
}

