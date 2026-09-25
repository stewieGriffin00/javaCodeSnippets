class Phone{
    int ram,price,screenSize;
    String maker,brand,color;
    static String device_type = " Mobile Phone";
    public void showDetails(){
        System.out.println("manufacturer: "+this.maker+" brand: "+this.brand);
        System.out.println(" color: "+this.color+" screensize: "+" ram "+this.ram+"    price"+this.price);
    }

    public Phone(String maker,String brand){
        this.maker = maker;
        this.brand = brand;

        /*  since the arguments and the object varibles have the same names 
        we differentiate them inside using the 'this' keyword.  The one 
         with the this keyword is  of the object and the one without is of 
         the argument local variable. if we had used different names 
         for both the variables then we need not use the 'this' keyword.  
        
         System.out.println(" this.maker = "+this.maker+" this.brand "+this.brand);
        maker = "oppo";
        System.out.println(" maker: "+maker); */
    }
}


