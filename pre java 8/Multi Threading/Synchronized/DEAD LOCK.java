class MultithreadingDeadLock{
    public static void main(String[] args){
        CLassA ob1 = new CLassA();
        CLassB ob2 = new CLassB();
        Thread1 t1 = new Thread1(ob1,ob2);
        Thread2 t2 = new Thread2(ob1,ob2);
        t2.start();
        t1.start();
    } 
}

class CLassA{
    synchronized void add(CLassB ob){
        System.out.println(" classA add method");
        ob.sub();
    }
    synchronized void sub(){
        System.out.println(" Class A Sub method ");
    }
}

class CLassB{
    synchronized void add(CLassA ob){
        System.out.println(" classB add method");
        ob.sub();
    }
    synchronized void sub(){
        System.out.println(" Class B Sub method ");
    }
}

class Thread1 extends Thread{
    CLassA classA;
    CLassB cLassB;
    Thread1(CLassA ob1, CLassB ob2){
        classA = ob1;
        cLassB = ob2;
    }
    @Override
    public void run(){
        System.out.println("enter thread 1   run method ");
        classA.add(cLassB);
    }
}

class Thread2 extends Thread{
    CLassA classA;
    CLassB cLassB;
    Thread2(CLassA ob1, CLassB ob2){
        classA = ob1;
        cLassB = ob2;
    }
    @Override
    public void run(){
        System.out.println("enter thread 2 run method ");
        cLassB.add(classA);
    }
}
