class MAin{
    public static void main(String[] args){
        Sample2 ob1 = new Sample2();
        ob1.method();
        System.out.println("-----------------");
        Sample2 ob2 = new Sample2();
        ob2.method();
        // ob2.pi = 9.81;
    }
}

class Sample2 implements sample{
    void method(){
        System.out.println(" pi :"+pi);
        pi++; // cannot carry out this statement as the variables inside the interfaces are 
              // by default public static final and cannot be changed.  
    }
}

interface sample{
    float pi = 3.14f;
}
