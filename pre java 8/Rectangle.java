class Rectangle{
    public static void main(String[] args){
        Rectangle obj1 = new Rectangle(300);
        Rectangle obj2 = new Rectangle(100,400);
        Rectangle obj3 = new Rectangle();
        System.out.println(" Rectangle 1 only one argument "+" width: "+obj1.width+" length: "+obj1.length);
        System.out.println(" Rectangle 2 two arguments "+" width: "+obj2.width+" length: "+obj2.length);
        System.out.println(" Rectangle 3 no argument "+" width: "+obj3.width+" length: "+obj3.length);
    }
    int width,length;
    Rectangle(){
        this.width = 100;
        this.length = 200;
    }
    Rectangle(int w,int l){
        this.width = w;
        this.length = l;
    }
    Rectangle(int s){
        this.width = s;
        this.length = s;
    }
}