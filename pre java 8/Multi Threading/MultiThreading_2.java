class MultiThreading{
    public static void main(String[] args){
        // System.out.println();
        Thread1 ob1 = new Thread1();
        Thread2 ob2 = new Thread2();
        ob1.start();
        ob2.start();
    }
}

class Thread1 extends Thread{
    int j = 1;
    public void run(){
        while(j <= 50){
            System.out.println("    j: "+j);
            j++;
        }
    }
}

class Thread2 extends Thread{
    int i = 1;
    public void run(){
        while(i <= 50){
            System.out.println("    i: "+i);
            i++;
        }
    }
}
