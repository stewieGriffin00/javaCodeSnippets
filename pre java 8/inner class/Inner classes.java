// System.out.println(); 

class MainB{
   public static void main(String[] args){
        MainA ob1 = new MainA(){
            void show(){
                System.out.println(" show method  ");
            }
            void show2(){
                System.out.println(" show2 method  ");
            }
        };
        ob1.show();
        System.out.println(ob1 instanceof MainA);
        // ob1.show2();
        // we cannot declare a method that is not in the abstract class like
        // this. 
    }  
}

abstract class MainA{
    abstract void show();
}

