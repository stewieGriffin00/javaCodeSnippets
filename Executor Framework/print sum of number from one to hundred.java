class Sample {
    public static void main(String[] args) {
        
        ClassTwo classTwo= new ClassTwo();
        Thread t1= new Thread(classTwo);
        t1.start();
    }
}

class ClassTwo implements Runnable{
    int i= 0;
    @Override
    public void run(){
        for(int j=1; j<101; j++){
            i= i+j;
            System.out.println(i);
        }
    }
}
