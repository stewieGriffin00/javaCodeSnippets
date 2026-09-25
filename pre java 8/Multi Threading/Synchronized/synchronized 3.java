class Main{
    public static void main(String[] args){
        C c = new C();
        T1 t1 = new T1(c);
        T2 t2 = new T2(c);

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();
        
    } 
}

class T1 implements Runnable{

    C c;

    T1(C c){
        this.c = c;
    }

    @Override
    public void run(){
        c.m1();
    }
}

class T2 implements Runnable{

    C c;
    T2(C c){
        this.c = c;
    }

    @Override
    public void run(){
        c.m2();
    }
}

class C{

    /* synchronized */ void m1(){
        for(int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    /* synchronized */ void m2(){
        for(int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

}