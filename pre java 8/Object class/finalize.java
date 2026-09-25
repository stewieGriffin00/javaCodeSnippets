
class Database{
    public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        v1 = null;
        System.gc();
    }
}

class Vehicle{
    @Override
    public void finalize(){
        System.out.println(" finalize method ");
    } 
}
