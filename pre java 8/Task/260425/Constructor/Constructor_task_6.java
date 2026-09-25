class Rectangle{
    int length, breadth;
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(10);
        Rectangle rect3 = new Rectangle(20,24);
        rect1.calculateArea();
        rect2.calculateArea();
        rect3.calculateArea();

    }

    Rectangle(){
        length = 10;
        breadth = 20;
    }
    Rectangle(int a){
        length = breadth =a;
    }
    Rectangle(int l,int b){
        length =l;
        breadth =b ;
    }
    void calculateArea(){
        System.out.println(" area: "+(length*breadth));
    }
}