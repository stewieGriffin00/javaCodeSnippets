// System.out.println();
class Database{
    public static void main(String[] args){
        OuterCLass oc = new OuterCLass();
        OuterCLass.InnerCLass ic = oc.new InnerCLass();
        System.out.println(ic.p);
        ic.print();
    }   
}

class OuterCLass{
    class InnerCLass{
        int p= 10;
        void print(){
            System.out.println(" Inner CLass > print ");
        }
    } 
}