class FurnitureMain{
    public static void main(String[] args){
        Furniture table1 = new Table();
        table1.assemebling();
        table1.disassemebling();
        Table table2 =(Table) table1;
        table2.assemebling();
        table2.disassemebling();
    }
}

class Furniture{
    void assemebling(){
        System.out.println("aSSEMBLING...");
    }
    void disassemebling(){
        System.out.println("disaSSEMBLING...");
    }
}

class Table extends Furniture{
    void tableMethod(){
        System.out.println("table is used for sitting and talking ");
    }
    @Override
    void assemebling(){
        System.out.println("Table is aSSEMBLING...");
    }
    @Override
    void disassemebling(){
        System.out.println("Table is disaSSEMBLING...");
    }
}
class Bed extends Furniture{
    void bedMethod(){
        System.out.println("Bed is used for sleeping ");
    }
    @Override
    void assemebling(){
        System.out.println(" bed is aSSEMBLING...");
    }
    @Override
    void disassemebling(){
        System.out.println(" bed is disaSSEMBLING...");
    }
}