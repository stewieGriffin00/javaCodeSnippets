// System.out.println();

class Inheritance3{
    public static void main(String[] args){
        Vehicle ob1 = new Vehicle();
        ob1.ride();
        Bike ob2 = new Bike();
        ob2.twoWheeler();
        Car ob3 = new Car();
        ob3.fourWheeler();
    }
}

class Vehicle{
    public void ride(){
        System.out.println(" ride method from vehicle class ");
    }
}

class Bike extends Vehicle{
    public void twoWheeler(){
        System.out.println(" from two wheeler function in bike class ");
    }
}

class Car extends Vehicle{
    public void fourWheeler(){
        System.out.println(" from Car class method car ");
    }
}