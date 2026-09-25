class Database{
    	 public static void main(String[] args)
  	{
	       	System.out.println("Main programme start");
		System.out.println(retcount("three"));   
		System.out.println(retname("batman"));   
 	}
   	public static String retcount(String m){
		System.out.println(" Inside name method ");
		return m;
	}
	public static String retname(String nm){
		System.out.println("inside retname method");
		return nm;
	}
}