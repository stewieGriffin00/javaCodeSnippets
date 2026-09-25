class Sample{
    public static void main(String[] args){
            Database2 data =  Database2.getInstance(); // 1, 5    
            data.demoMethod(); // 6, 9
    }
}

class Database2{
    private static Database2 instance = new Database2();
    private Database2(){}
    public static Database2 getInstance(){ // 2,
        if(instance == null){ // 3
            instance = new Database2();
        }
        return instance; // 4
    }
    public static void demoMethod(){ // 7
        System.out.println("Demo MEthod"); // 8
    }
}

