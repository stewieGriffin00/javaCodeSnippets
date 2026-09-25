import java.util.ArrayList;

class ArrayLists{
    public static void main(String[] args){
        AddElements addElements = new AddElements();
        Thread t1 = new Thread(addElements);
        Thread t2 = new Thread(addElements);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            System.out.println(" exception ");
        }
        addElements.see();
        // System.out.println();
    }
}

class AddElements implements Runnable{
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    @Override
    public void run(){
        for(int i=0; i<200_000; i++){
            arrayList.add(i);
        }
    }
    public void see(){
        // System.out.println(arrayList.get(100000));
        // System.out.println(arrayList.get(200000));
        System.out.println(arrayList.size());
    }
}