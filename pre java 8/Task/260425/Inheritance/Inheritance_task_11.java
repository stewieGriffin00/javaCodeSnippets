class FurnitureMain{
    public static void main(String[] args)[
        
    ]
}

class Furniture{
    void assemebling(){
        System.out.println("aSSEMBLING...");
    }
    void disassemebling(){
        System.out.println("disaSSEMBLING...");
    }
}

class Chair extends Furniture{
    
}
class Table extends Furniture{
    
}
class Bed extends Furniture{
    void bedMethod(){
        System.out.println("Bed is used for sleeping ");
    }
}