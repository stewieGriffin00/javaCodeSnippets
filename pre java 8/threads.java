class DAtabase extends Thread{
    public static void main(String[] args){
        DAtabase ob1 = new DAtabase();
        DAtabase ob2 = new DAtabase();
        ob1.setName(" Apple ");
        ob2.setName(" Orange ");
        ob1.start();
        ob2.start();
    }
    public void run(){
        for(int i = 1; i<=100; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }   

}