// p P 

class Inheritance{
    public static void main(String[] args){
        Television tv1 = new Television();
        tv1.changeChannel();
        Laptop laptop1 = new Laptop();
        laptop1.sleepMode();
    }
}

class ElectronicDevice{
    void powerOn(){
        System.out.println("Turn On method");
    }
    void powerOff(){
        System.out.println("Turn off method");
    }
}

class Laptop extends ElectronicDevice{
    void sleepMode(){
        System.out.println("sleep mode.");
    }
}

class Television extends ElectronicDevice{
    void changeChannel(){
        System.out.println("Changing Channel.");
    }
}

