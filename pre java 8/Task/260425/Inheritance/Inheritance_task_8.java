class Instrument{
    void play(){
        System.out.println("play method from Instrument class ");        
    }
    void tune(){
        System.out.println("tune method from Instrument class ");        
    }
}

class Guitar extends Instrument{

}

class Piano extends Instrument{

}

class ElectricGuitar extends Instrument{
    void electricGuitar(){
        System.out.println(" Electric guitars have nice sound ");
    }
}

class InstrumentMain{
    public static void main(String[] args){
       
    }
}