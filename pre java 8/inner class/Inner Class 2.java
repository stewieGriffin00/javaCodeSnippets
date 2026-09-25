// System.out.println();

class InnerCLasses{
    public static void main(String[] args){
        if(true){
            class InnerCLass{
                int p= 10;
                void print(){
                    System.out.println(" Inner CLass > print ");
                }
            } 
            InnerCLass ic = new InnerCLass();
            System.out.println(ic.p);
            ic.print();
        }
    }   
}
