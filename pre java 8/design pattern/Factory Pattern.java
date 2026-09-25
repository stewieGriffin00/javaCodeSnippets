class FactoryPattern{
    public static void main(String[] args){
        DBConnect mySQL = MySQL.createInstance();
        mySQL.connect();

        DBConnect postgreSQL = PostgreSQL.createInstance();
        postgreSQL.connect();
    } 
}

interface DBConnect{
   void connect();
}

class MySQL implements DBConnect{
    private MySQL(){}

    public void connect(){
        System.out.println("\t Connecting MySQL");
    }
    static MySQL createInstance(){
        return new MySQL();
    }
}
class PostgreSQL implements DBConnect{
    private PostgreSQL(){}
    public void connect(){
        System.out.println("\t Connecting PostgreSQL");
    }
    static PostgreSQL createInstance(){
        return new PostgreSQL();
    }
}

