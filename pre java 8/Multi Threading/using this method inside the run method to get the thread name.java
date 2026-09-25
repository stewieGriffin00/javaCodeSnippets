class MultiThreading{
    public static void main(String[] args){
        Database ob1 = new Database();
        ob1.start();
    }
}

class Database extends Thread{
    @Override
    public void run(){
        System.out.println(" B "+this.getName());
        System.out.println(" C "+this.getState());
    }
}

