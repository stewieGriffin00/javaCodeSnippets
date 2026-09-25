class Dataabase{
    static int m = 0;
    public static void main(String[] args){
        func1();
    }
    static void func1(){
        
        System.out.print(m);
        m++;
        System.out.print(" ");
        if(m  == 100){
            return;
        }
        func1();
    }
}
