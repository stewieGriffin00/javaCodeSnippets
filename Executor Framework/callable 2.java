// Create a Callable that returns your name as a String. Submit it and print the result.

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Test{
    public static void main(String[] args) throws Exception{
        MyTask1 task1= new MyTask1();
        MyTask2 task2= new MyTask2();

        ExecutorService execServ;
        execServ = Executors.newFixedThreadPool(2);

        Future<String> future1= execServ.submit(task1);
        Future<String> future2= execServ.submit(task2);

        System.out.println(future1.get());
        System.out.println(future2.get());

        execServ.shutdown();
    }
}

class MyTask1 implements Callable<String>{
    
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "first";
    }
}

class MyTask2 implements Callable<String>{
    
    @Override
    public String call() throws Exception {
       Thread.sleep(4000);
        return "second";
    }
}

