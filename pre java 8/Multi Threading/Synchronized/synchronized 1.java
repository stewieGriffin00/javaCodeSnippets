class MultiThreading{
    public static void main(String[] args){
        Database ob1 = new Database();
        Database ob2 = new Database();
        ob1.start();
        ob2.start();
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
