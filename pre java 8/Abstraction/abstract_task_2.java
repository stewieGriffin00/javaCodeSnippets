abstract class Shape{
    abstract void calculateArea(double l);
    abstract void calculatePerimeter(double l);
}

class Circle extends Shape{
    @Override
    void calculateArea(double l){
        System.out.println(" Area: "+(3.14*l*l));
    }
    void calculatePerimeter(double l){
        System.out.println(" Perimeter: "+(2*3.14*l));
    }
}

class Square extends Shape{
    @Override
    void calculateArea(double l){
        System.out.println(" Area: "+(l*l));
    }
    @Override
    void calculatePerimeter(double l){
        System.out.println(" Perimeter: "+(4*l));
    }
}

class AbstractionMain{
    public static void main(String[] args){
       Square sq1 = new Square();
       Circle circle1 = new Circle();
       sq1.calculateArea(10);
       sq1.calculatePerimeter(12);
       circle1.calculateArea(20);
       circle1.calculatePerimeter(30);
    }
}