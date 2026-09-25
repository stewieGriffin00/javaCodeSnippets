class Building{
    void construct(){
        System.out.println("construct method from Building class ");        
    }
    void demolish(){
        System.out.println("Demolish method from Building class ");        
    }
}

class House extends Building{

}

class Office extends Building{

}

class Skyscraper extends Building{
    void skyscraperMethod(){
        System.out.println(" Skyscrapers are very tall ");
    }
}

class BuildingMain{
    public static void main(String[] args){
        Skyscraper skyscrp1 = new Skyscraper();
        Skyscraper.skyscraperMethod();
    }
}