class Database{
    public static void main(String[] args){
        // System.out.println();
        Subclass ob1 = new Subclass();
        ob1.displayObjectCount();
        Subclass ob2 = new Subclass();
        ob2.displayObjectCount();
        Subclass ob3 = new Subclass();
        ob3.displayObjectCount();
        Subclass ob4 = new Subclass();
        ob4.displayObjectCount();
        Subclass ob5 = new Subclass();
        ob5.displayObjectCount();
    }
}

class Subclass{
    static int object_create_count = 0;
    Subclass(){
        object_create_count++;
    }
    void displayObjectCount(){
        System.out.println(" no of objects created: "+object_create_count);
    }
}