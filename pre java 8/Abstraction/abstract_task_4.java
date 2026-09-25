class AbstractMain{
    public static void main(String[] args){
        Fan fan1 = new Fan();
        Microwave microwave1 = new Microwave();
        fan1.turnOn();
        fan1.turnOff();
        fan1.pluggedIn();
        System.out.println("____________________\n");
        microwave1.turnOn();
        microwave1.turnOff();
        microwave1.pluggedIn();
    }
}

class Microwave extends Appliance{
    void turnOff(){
        System.out.println(" selct the turn off option in menu microwave ");
    }
    void turnOn(){
        System.out.println(" selct the turn on option to turn on  ");
    }
}

class Fan extends Appliance{
    void turnOff(){
        System.out.println("Press the switch to turn Off ");
    }
    void turnOn(){
        System.out.println("Press the switch to turn On ");
    }
}

abstract class Appliance{
    abstract void turnOn();
    abstract void turnOff();
    void pluggedIn(){
        System.out.println("Appliace is plugged in....");
    }
}

