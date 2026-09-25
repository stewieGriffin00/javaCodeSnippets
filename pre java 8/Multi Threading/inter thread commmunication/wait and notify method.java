class MultiThreading{
    public static void main(String[] args){
        Class1 ob1  = new Class1();
        Thread1 t1 = new Thread1(ob1);
        Thread2 t2 = new Thread2(ob1);
        t1.start();
        t2.start();
    }
}

class Thread1 extends Thread{
   Class1 class1;
   Thread1(Class1 class1){
        this.class1 = class1;
   }
   @Override
   public void run(){
        class1.m1();
   }
}

class Thread2 extends Thread{
   Class1 class1;
   Thread2(Class1 class1){
        this.class1 = class1;
   }
   @Override
   public void run(){
        class1.m2();
   }
}

class Class1{
    public synchronized void m1(){
            System.out.println("before wait");
            try{
                wait();
            }
            catch(InterruptedException iE){
                System.out.println("exception");
            }
            System.out.println("after wait");
        }
    public synchronized void m2(){
            System.out.println(Thread.currentThread().getName()+" in method 2 ");
            notify();
    }
}

