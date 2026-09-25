class d1{
    int count = 0;
    static {
       
        System.out.println("static");//2
    }
    {   
        count +=1 ;     
        System.out.println("instance"+count);//3
    }
   static void na(){
        System.out.println("func invoke");//4
        }
}
class Database{
      static{
        System.out.println(" hellow world ");//1
    }
    public static void main(String[] args){
        // System.out.println();
        d1 d =new d1();
        // d.na();
        d1 d1 = new d1();
        d1 d2 = new d1();
    }
  
}
