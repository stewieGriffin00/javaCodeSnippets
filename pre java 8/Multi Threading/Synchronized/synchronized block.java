class MultiThreading{
    public static void main(String[] args){
        CLass1 ob2 = new CLass1();
        CLass2 ob1 = new CLass2(ob2);
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob1);
        t1.setName("T-1");
        t2.setName("T-2");
        t1.start();
        t2.start();
    }
}

class CLass1{
     void show(){
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

class CLass2 extends Thread{
    CLass1 obj;
    CLass2(CLass1 obj){
        this.obj = obj;
    }
    @Override
    public void run(){
        obj.show();
    }
}