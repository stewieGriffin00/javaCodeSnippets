// Singleton design pattern 
class Database{
    public static void main(String[] args){
        // Employyee.createObj();
        Employyee ob1 = Employyee.createInstace();
        ob1.showMessage();
    }
}

class Employyee{
    private static Employyee employeeObj = new Employyee();
    private Employyee(){}
    public static Employyee createInstace(){
        if(employeeObj == null){
            employeeObj= new Employyee();
        }
        return employeeObj;
    }
    public void showMessage(){
        System.out.println(" employee goes to work ");
    }
}

/* class Employyee{
    private Employyee(){

    }
    void print(){
        System.out.println(" employee works... ");
    }
    static void createObj(){
        new Employyee().print(); 
    }
} */


