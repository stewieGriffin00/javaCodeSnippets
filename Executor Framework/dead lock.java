class MyClass{
    public static void main(String[] args){
        ClassOne cl1= new ClassOne();
        ClassTwo cl2= new ClassTwo(cl1);
        cl1.cl2= cl2;
        
        TaskA r1= new TaskA(cl1);
        TaskB r2= new TaskB(cl2);

        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);

        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        }
        catch (Exception e) {
            System.out.println(" error occured insidde the catch block"+ e.getMessage());
        }
        

    }
}

class TaskA implements Runnable{
    ClassOne cl1;

    public TaskA(ClassOne cl1) {
        this.cl1 = cl1;
    }
    
    @Override
    public void run() {
        cl1.methodA();
    }

}

class TaskB implements Runnable{
    ClassTwo cl2;

    public TaskB(ClassTwo cl2) {
        this.cl2 = cl2;
    }


    @Override
    public void run() {
        cl2.methodB();
    }

}

class ClassOne{
    ClassTwo cl2;

    ClassOne(){
    }
    public synchronized  void methodA(){
        System.out.println("inside the Class One> Method A");
        cl2.other();
    }

    public synchronized  void other(){
        System.out.println("inside class One> Other method");
    }
}

class ClassTwo{
    ClassOne cl1;
    ClassTwo(ClassOne cl1){
        this.cl1= cl1;
    }

    public synchronized  void methodB(){
        System.out.println("inside the Class two> Method B");
        cl1.other();
    }

    public synchronized  void other(){
        System.out.println("inside class One> Other method");
    }
}

