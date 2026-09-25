// invoke waits until all the tasks are finished that is we get all the results at one time after all the tasks are finsihed
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Test{
    public static void main(String[] args) throws Exception{
        MyTask1 task1= new MyTask1();
        MyTask2 task2= new MyTask2();

        ExecutorService execServ = Executors.newFixedThreadPool(2);

        List<Callable<String>> tasks= Arrays.asList(task1, task2);
        List<Future<String>> futures= execServ.invokeAll(tasks);
        // invoke waits until all the tasks are finished that is we get all the results at one time after all the tasks are finsihed
        
        for (Future<String> f : futures) {
            System.out.println(f.get());
        }

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

