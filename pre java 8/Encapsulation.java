class Encapsulation{
    public static void main(String[] args){
      Subclass ob1 = new Subclass();
      System.out.println(" num1: "+ob1.getterNum1()+" \n--------");
        ob1.setterNum1(2478876) ;
      System.out.println(" num1: "+ob1.getterNum1()+" \n--------");
      ob1.getterName1();    
      ob1.setterName1(" Clark kent");
      ob1.getterName1();
    }
}

class Subclass{
    private int num1 = 2345;
    private String name1 = " Bruce Wayne ";
    int getterNum1(){
      return num1;  
    }
    void setterNum1(int n1){
        this.num1 = n1;
    }
    void getterName1(){
        System.out.println(this.name1);
    }
    void setterName1(String s1){
        this.name1 = s1;
    } 
}