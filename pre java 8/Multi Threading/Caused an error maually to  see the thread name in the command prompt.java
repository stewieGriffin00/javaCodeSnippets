class MultiThreading{
    public static void main(String[] args){
        Database ob1 = new Database();
        Database ob2 = new Database();
        Thread t2 = new Thread(ob2,"T-2");
        Thread t1 = new Thread(ob1,"T-1");
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException iE){
            System.out.println("InterruptedException");
        }
        ob1.addvalue();
    }
}

class Database extends Thread {
    static int count = 0;
    @Override
    public void run(){
        // synchronized(this){
            for(int i=0; i<5000; i++){
                count++;
                if(Thread.currentThread().getName() == "T-1" && i==10){
                    throw new ArithmeticException(" hellow wordl ");
                }
                if(Thread.currentThread().getName() == "T-2" && i==4999){
                    System.out.println(" \nthread 2 is finished ");
                }   
            }
    }
    void addvalue(){
        System.out.printf("count: %d ",count);
    }
}


