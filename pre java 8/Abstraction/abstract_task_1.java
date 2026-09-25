abstract class Vehicle{
    abstract void start();
    abstract void stop();
    abstract void fuelType();
}

class Car extends Vehicle{
    void start(){
        System.out.println("Starting Car.....");
    }
    void stop(){
        System.out.println("Stopping Car.....");
    }
    void fuelType(){
        System.out.println("I can use both petrol and diesel");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Starting bike.....");
    }
    void stop(){
        System.out.println("Stopping bike.....");
    }
    void fuelType(){
        System.out.println("I can use only petrol");
    }
}

class AbstractionMain{
    public static void main(String[] args){
        Car car1 = new Car();
        car1.start();
        car1.stop();
        car1.fuelType();
        System.out.println("+++++++++++++++==++++=++++++");
        Bike bike1 = new Bike();
        bike1.start();
        bike1.stop();
        bike1.fuelType();
    }
}