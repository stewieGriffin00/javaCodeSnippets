// invoke waits until all the tasks are finished that is we get all the results at one time after all the tasks are finsihed
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Test{
    public static void main(String[] args) throws Exception{
     
        List<Callable<Integer>> tasks= new ArrayList<>();
        for (int k=1; k<11; k++) {
            tasks.add(new MyTask1(k));
        }

        ExecutorService execServ =Executors.newFixedThreadPool(10);

        List<Future<Integer>> futures = execServ.invokeAll(tasks);

        for (Future<Integer> f : futures) {
            System.out.println(f.get());
        }   

        execServ.shutdown();
    }
}

class MyTask1 implements Callable<Integer>{
    
    int i;

    public MyTask1(int i) {
        this.i = i;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(i*1000);
        return i;
    }
}

