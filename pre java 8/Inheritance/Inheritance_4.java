// System.out.println();

class Inheritance{
    public static void main(String[] args){
        Vehicle ob1 = new Vehicle();
        System.out.println(" creating an object for Class: Vehicle ");
        // ob1.ride();
        Bike ob2 = new Bike();
        System.out.println(" creating an object for Class: Bike ");
        // ob2.twoWheeler();
    }
}

class Vehicle{
    Vehicle(){
        System.out.println(" constructor of Vehicle Class.  ");
    }
    public void ride(){
        System.out.println(" ride method from vehicle class ");
    }
}

class Bike extends Vehicle{
    Bike(){
        System.out.println(" constructor of Bike Class.  ");
    }
    public void twoWheeler(){
        System.out.println(" from two wheeler function in bike class ");
    }
}



