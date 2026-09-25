class MultiThreading{
    public static void main(String[] args){
        System.out.println(" A "+Thread.currentThread().getName());
        System.out.println(" B "+Thread.currentThread().getState());
        Database ob1 = new Database();
        ob1.start();
        System.out.println(" C "+ob1.getState());

    }
}

class Database extends Thread{
    @Override
    public void run(){
        System.out.println(" D "+Thread.currentThread().getName());
        System.out.println(" E "+Thread.currentThread().getState());
    }
}