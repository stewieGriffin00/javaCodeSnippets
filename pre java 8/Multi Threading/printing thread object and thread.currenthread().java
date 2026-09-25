class MultiThreading{
    public static void main(String[] args){
        Database ob1 = new Database();
        System.out.println(ob1);
    }
}

class Database extends Thread {
    @Override
    public void run(){
        System.out.println(" B "+Thread.currentThread());
    }
}

