class Multithreading{
    public static void main(String[] args) throws InterruptedException{
        Print ob = new Print();
        Thread1 thread1  = new Thread1(ob);
        Thread2 thread2  = new Thread2(ob);
        thread1.start();
        thread2.start();
        Thread.sleep(1000);
        System.out.println(ob.sb);
    }
}

class Print{
    StringBuilder sb = new StringBuilder("Hello");
    void apppOne(){
        for(int i=1; i<=5; i++){
            sb.append("1");
        }
    }
    void appTwo(){
        for(int i=1; i<=5; i++){
         sb.append("2");
        }
    }
}

class Thread1 extends Thread{
    Print p;
    Thread1(Print p){
        this.p = p;
    }
    @Override
    public void run(){
        p.apppOne();
    }
}

class Thread2 extends Thread{
    Print p;
    Thread2(Print p){
        this.p = p;
    }
    @Override
    public void run(){
        p.appTwo();
    }
}
