class Database{
    public static void main(String[] args){
        Vehicle bike1 = new Bike();
        System.out.println(" "+bike1.m);
        bike1.sayHello();
    }
}

class Bike extends Vehicle{
    int m = 2000;
    @Override
    void sayHello(){
        System.out.println(" Bike Class ");
    }
}

class Vehicle{
    int m = 100;
    void sayHello(){
        System.out.println(" Vehicle class ");
    }
}

