// we will try to call the instance variable from static method
class Database{
    int r = 6757;
    public static void main(String[] args){
       Database obj1 = new Database(); 
       obj1.fun1();
        // fun1();
       
    }
    public Database(){
        System.out.println(" object is created ");
    }
    public static void fun1(){
        // following line will create an error because an instance variable cannot be called from a 
        // static context which means an instance varibale cannot be accessed within a static method.s
        // System.out.println(" this.r = "+this.r);
        System.out.println(" inside fun1 method ");
    }
}
