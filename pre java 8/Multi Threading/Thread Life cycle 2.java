class MultiThreading{
    public static void main(String[] args){
        Database ob1 = new Database();
        try{
            ob1.start();
            ob1.join();
        }
        catch(InterruptedException ie){
            System.out.println(" error while trying to implement join ");
        }
        System.out.println(" A "+ob1.getState()); //OP:  A TERMINATED
    }
}

class Database extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println(i);
            i++;
        }
    }
}