class Database{
    public static void main(String[] args){
        Vehicle vh1 = new Bike();
        vh1.show();
        vh1.call();
    }   
}

class Vehicle{
    void show(){
        System.out.println(" I'm from vehicle class show method ");
    }
    void call(){
        System.out.println(" vehicle class call method ");
    }
}

class Bike extends Vehicle{
    @Override
    void show(){
        System.out.println(" Bike CLass Show Mehtod ");
    }
    @Override
    void call(){
        System.out.println(" lets call parent call, call method ");
        super.show();
        System.out.println(" Bike class call method ");
    }
}