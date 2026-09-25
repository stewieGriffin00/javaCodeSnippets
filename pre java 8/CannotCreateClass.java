// cannot create class

class CannotCreateClass{
    public static void main(String[] args){
        Subclass  ob1 = new Subclass();
    }
}

class Subclass{
    private Subclass(){
        System.out.println(" object is created ");
    }
}