class Instrument{
    void play(){
        System.out.println("play method from Instrument class ");        
    }
    void tune(){
        System.out.println("tune method from Instrument class ");        
    }
}

class ElectricGuitar extends Instrument{
    @Override
    void play(){
        System.out.println("play method from Electric guitar class ");        
    }
    @Override
    void tune(){
        System.out.println("tune method from Electric guitar class ");        
    }
    public void guitarPlaying(){
        System.out.println("I am playing electric guitar");
    }
}

class InstrumentMain{
    public static void main(String[] args){
       Instrument electricGuitar1 = new ElectricGuitar();
       electricGuitar1.play();
       electricGuitar1.tune();
    //    electricGuitar1.guitarPlaying();
       ElectricGuitar electricGuitar2 = (ElectricGuitar) electricGuitar1;
       electricGuitar2.play();
       electricGuitar2.tune();
       electricGuitar2.guitarPlaying();
    }
}
