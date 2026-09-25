class MultithreadingDeadLock{
    public static void main(String[] args) throws InterruptedException{
       CLassA ob1 = new CLassA();
       Thread t1  = new Thread(ob1);
       t1.setDaemon(true);
       t1.start();
       for(int i=1; i<=100;i++){
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" "+i);
       }
    } 
}

class CLassA extends Thread{
    @Override 
    public void run(){
        for(;;){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException iE){
                System.out.println(iE.getMessage());
            }
            System.out.println("Save");
        }
    }
}

