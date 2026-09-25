// p P 

class Inheritance_task_5{
    public static void main(String[] args){
        
    }
}

class Animal{
    void eat(){
        System.out.println("eating method");
    }
    void sleep(){
        System.out.println("sleeping method");
    }
}

class Bird extends Animal{
    void flying(){
        System.out.println("Birds can fly");
    }
}

class Mammal extends Animal{
    void mammal (){
        System.out.println("Mammals cannot fly");
    }
}

class Bat extends Bird{
    void batSpecificMethod(){
        System.out.println("bat flies at night time ");
    }
}

class Penguin extends Mammal{
    void penguinSpecificMethod(){
        System.out.println("penguin lives in cold place ");
    }
}

