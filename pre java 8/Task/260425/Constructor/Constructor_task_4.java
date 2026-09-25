class CircleClass{
    public static void main(String[] args){
        System.out.println(" Circle Class  ");
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(20);
        Circle circle4 = new Circle();
        circle1.calculateArea();
        circle2.calculateArea();
        circle3.calculateArea();
        circle4.calculateArea();
    }
}

class Circle{
    int radius;
    Circle(){
        radius = 1;
    }
    Circle(int r){
        radius = r;
    }
    void calculateArea(){
        System.out.println(" area: "+(3.14*radius*radius));
    }
}



