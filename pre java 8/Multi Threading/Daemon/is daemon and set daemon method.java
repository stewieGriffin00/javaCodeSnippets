class MultithreadingDeadLock{
    public static void main(String[] args) throws InterruptedException{
       CLassA ob1 = new CLassA();
       Thread t1 = new Thread(ob1);
        t1.setDaemon(true);
        t1.start();
        for(int i=1; i<100; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        System.out.println(t1.isDaemon());
    } 
}

class CLassA extends Thread{
    @Override 
    public void run(){
        for(int i=1; i<100; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

