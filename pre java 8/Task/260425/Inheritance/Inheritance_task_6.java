// p P 

class Inheritance_task_6{
    public static void main(String[] args){
        
    }
}

class Shape{
    void calculateArea(){
        System.out.println("Calculating area...");
    }
    void perimeter(){
        System.out.println("Calculating perimeter...");
    }
}

class Rectangle extends Shape{

}

class Circle extends Shape{

}

class Cylinder extends Rectangle, Circle{
    void calculateCylinderVolume(){
        System.out.println("Calculating Cylinder volume...");
    }
}

