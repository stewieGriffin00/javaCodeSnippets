class Database{
    public static void main(String[] args){
        Class1 ob  = Class1.getObj();
        ob.addTwoNum(10,34);
        Class1 ob2 = Class1.getObj();
        ob.addTwoNum(87,34); // 
    }
}

class Class1{
   static Class1 ob1;  
   private Class1(){}
   static Class1 getObj(){
        if(ob1==null){
            ob1 = new Class1();
        }
        return ob1;
   }
    void addTwoNum(int x, int y){
        System.out.println(" add: "+(x+y)+" hash code: "+this.hashCode());
    // hashcode is used here to show that same object is utilized every time here. NO new 
    // objects are created.
   }
}
