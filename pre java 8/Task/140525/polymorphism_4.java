class BuildingMain{
    public static void main(String[] args){
        Building skyscrp1 = new Skyscraper();
        skyscrp1.construct();
        skyscrp1.demolish();
        Skyscraper skyscrp2 = (Skyscraper) skyscrp1;
        skyscrp2.construct();
        skyscrp2.demolish();
        // skyscrp1.skyscraperMethod();
        skyscrp2.skyscraperMethod();
    }
}

class Skyscraper extends Building{
    @Override
    void construct(){
        System.out.println("construct method from Skyscraper class ");        
    }
    @Override
    void demolish(){
        System.out.println("Demolish method from Skyscraper class ");        
    }
    void skyscraperMethod(){
        System.out.println(" Skyscrapers are very tall ");
    }
}

class Building{
    void construct(){
        System.out.println("construct method from Building class ");        
    }
    void demolish(){
        System.out.println("Demolish method from Building class ");        
    }
}
