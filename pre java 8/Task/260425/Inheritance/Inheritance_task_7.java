// p P 

class Inheritance{
    public static void main(String[] args){
        GamingLaptop gP1 = new GamingLaptop();
        gP1.graphics();
        SmartPhone sPhone1 = new SmartPhone();
        sPhone1.highPerformance();
    }
}

class Device{
    void turnOn(){
        System.out.println("Turn On method");
    }
    void turnOff(){
        System.out.println("Turn off method");
    }
}

class Phone extends Device{

}

class Laptop extends Device{

}

class SmartPhone extends Phone{
    void highPerformance(){
       System.out.println("I am SMart phone I operate very fast"); 
    }
}

class GamingLaptop extends Laptop{
    void graphics(){
       System.out.println("you can play high graphis games with me"); 
    }
}