class Database{
     public static void main(String[] args)
  {
       // largest three numbers 
       /* int a = 100, b = 20, c = 30;
        if((a>b)&&(a>c)){
           System.out.println(a+" is largest number ");
        }
        else if(b>c){
            System.out.println(b+" is largest ");
        }
        else{
             System.out.println(c+" is largest ");
        } */
    //    System.out.println();
        int a = 100, b = 101, c = 30;
        String result = (a>b)?(a>c)?a+" is largest ": c + " is largest":(b>c)?b+" is largest ":c+" is largest"; 
        System.out.println(result); 

 }   
}
