// P p
class ShapeMain{
    public static void main(String[] args){
        Circle circle1 = new Circle(3.45);
        Square square1 = new Square(12);
        Rectangle rectangle1= new Rectangle(20,34);
        
        System.out.println(" circle area: "+circle1.calculateArea());
        System.out.println(" rectangle area: "+rectangle1.calculateArea());
        System.out.println(" square area: "+square1.calculateArea());
    }
}

class Circle extends Shape{
    Circle(double r){
        this.radius = r;
    }   
    double radius;
    double calculateArea(){
        return 3.14*radius;
    }
}

class Square extends Shape{
    Square(double side){
        this.side = side;
    }  
    double side;
    double calculateArea(){
        return side*side;
    }
}

class Rectangle extends Shape{
    Rectangle(double l, double b){
        this.length = l;
        this.breadth = b;
    }  
    double length, breadth;
    double calculateArea(){
        return length*breadth;
    }
}

class Shape{
    double dimension;
    double calculateArea(){
        return dimension*1;
    }
}