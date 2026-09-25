// P p
class Vehicle{
    static int password = 12345;
    void startVehicle(int pwd){
        if(pwd == password){
            System.out.println(" vehicle is started ");
        }
        else{
            System.out.println(" password is wrong  ");
        }
    }
    void stopVehicle(){
        System.out.println(" vehicle is stopped  ");
    }
}
class Car extends Vehicle{
    static int password = 12345;
    void startVehicle(int pwd){
        if(pwd == password){
            System.out.println(" Car is started ");
        }
        else{
            System.out.println(" password is wrong  ");
        }
    }
    void stopVehicle(){
        System.out.println(" Car is stopped  ");
    }
}
class Bike extends Vehicle{
    static int password = 54321;
    void startVehicle(int pwd){
        if(pwd == password){
            System.out.println(" bike is started ");
        }
        else{
            System.out.println(" password is wrong  ");
        }
    }
    void stopVehicle(){
        System.out.println(" bike is stopped  ");
    }
}

class ElectricBike extends Vehicle{
    static int password = 00000;
    void startVehicle(int pwd){
        if(pwd == password){
            System.out.println(" bike is started ");
        }
        else{
            System.out.println(" password is wrong  ");
        }
    }
    void stopVehicle(){
        System.out.println(" bike is stopped  ");
    }
}

class VehicleMain{
    public static void main(String[] args){
        Bike bike1 = new Bike();
        bike1.startVehicle(54321);
        bike1.stopVehicle();
        bike1.startVehicle(34569);
    }
}