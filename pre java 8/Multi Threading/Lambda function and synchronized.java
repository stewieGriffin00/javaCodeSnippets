class MultiThreading{
    public static void main(String[] args){
        CLass1 ob2 = new CLass1();
        Thread t1 = new Thread(()->{ ob2.add(); },"T-1");
        Thread t2 = new Thread(()->{ ob2.add(); },"T-2");
        t1.start();
        t2.start();
    }
}

class CLass1{
     void add(){
        System.out.println(" one "+Thread.currentThread().getName());
        System.out.println(" two "+Thread.currentThread().getName());
        synchronized(this){
            System.out.println(" three "+Thread.currentThread().getName());
            System.out.println(" four "+Thread.currentThread().getName());
        }
        System.out.println(" five "+Thread.currentThread().getName());
        System.out.println(" six "+Thread.currentThread().getName());
    }
}
