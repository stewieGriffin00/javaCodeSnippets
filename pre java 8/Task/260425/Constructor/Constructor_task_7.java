class Car{
    public static void main(String[] args){
       Subclass car1 = new Subclass("Nano","Six_cylinder"); 
       Subclass car2 = new Subclass("BMW","Eight_cylinder"); 
       Subclass car3 = new Subclass("Alto"); 
       car1.displayDetails();
       car2.displayDetails();
       car3.displayDetails();
    }
}

class Subclass{
    String engine;
    String model;
    Subclass(){
        engine = " four_cylinder";
    }
    Subclass(String model, String engine){
        this.engine = engine;
        this.model = model;
    }
    Subclass(String model){
        this();
        this.model = model;
    }
    void displayDetails(){
        System.out.println(" Model: "+model+" || "+" Engine: "+engine+" \n +++++++++");
    }
}