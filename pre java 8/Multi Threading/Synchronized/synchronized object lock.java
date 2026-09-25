// run this script in bash to execute this prorgramme non-stop.
// for /l %d in (0,0,1) do java file_name.java
class MultiThreading{
    public static void main(String[] args){
        Database ob1 = new Database();
        Database ob2 = new Database();
        Thread t2 = new Thread(ob1,"T-2");
        Thread t1 = new Thread(ob2,"T-1");
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
            for(int i=0; i<1_000; i++){
                count++;
            }
        // }
    }
    void addvalue(){
        System.out.printf("count: %d ",count);
    }
}


