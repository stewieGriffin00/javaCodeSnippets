class Multithreading{
    public static void main(String[] args){
        T t= new T();
        Thread th = new Thread(t);
        th.start();
    }
}

class T implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

/*   Invoking a thread using the object reference of the class that implemented the runnable
    wont start the thread. BEcause it only works with thread class inherited class.
      So if you want to invoke the thread that implements the Runnable interface we need to
    pass it into the constructor of the thread class object.
        Only then you would be able to invoke the thread.  

 */