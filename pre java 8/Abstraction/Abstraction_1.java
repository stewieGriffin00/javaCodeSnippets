/* Abstraction:
   What is an Abstract Class?
       An abstract class is a special type of class that cannot be instantiated,
        but could be inherited.  
   Two types of methods inside Abstract class
      1. Concrete Method
      2. Abstract Method
    
    Concrete Method:
        The method inside abstract class that has an implementation.
        Note: 
            Overriding Concrete class is optional not necessary. 
    
    Abstract Method:
        The method inside abstract class that does not have an implementation. But should be 
        provided by the derived/ child class. Otherwise it will throw an error.
        It should have an @Override annotation preceding the method implementation
        @Override annotation keyword is optional.

    Parameterized Constructors inside abstract class:
        Even though the abstract class cannot be instantiated they can have
        constructors but they should be parameterized.
        We can store the values passed to them via the derived class constructor 
        using super method.
        Eg: 
        super(name);
        the value stored in name variable will be passsed to base class constructor 
        and stored in the variable that was declared inside the abstract class.
 */

abstract class Vehicle{
    int price;
    void wheels(){
        System.out.println("Wheels is necessary for Vehicles");
    }
    abstract void working();
    Vehicle(int price){
        this.price = price;
    }
}

class Bike extends Vehicle{
    Bike(int price){
        super(price);
    }
    /* void wheels(){
        System.out.println("I have two wheels");
    } */
    /* @Override
    void working(){
        System.out.println("I have a 100Cc engine and to ride me it is necessary to learn how to balance ");
    } */
}

class Car extends Vehicle{
    Car(int price){
        super(price);
    }
    void wheels(){
        System.out.println("I have four wheels");
    }
    @Override
    void working(){
        System.out.println("I have a Six cylinder engine and I operate with a large gear box. Also I am expensive. I am a car. ");
    }
}

class Abstraction{
    public static void main(String[] args){
        Car car1 = new Car(20_00_000);
        Car car2 = new Car(40_00_000);
        Bike bike1 = new Bike(1_00_000);
        Bike bike2 = new Bike(1_50_000);
        car1.wheels();
        car1.working();
        System.out.println("Car price: "+car1.price);
        bike1.working();
    }
}