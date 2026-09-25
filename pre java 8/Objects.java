class Ob{
	int n = 100;
	static int m = 200;  
   	  public static void main(String[] args)
 	 {
    		//  Ob ob1 = new Ob();
		second();
     		// System.out.println("hello world");
	 }   
	
	// non-static method
	public void first(){
		// System.out.println(" Inside non-static method: First");	
	}
	// static method
	public static void second(){
		
		System.out.println(m);
		 System.out.println(Ob.m);
		System.out.println(Ob.m);
		//System.out.println(" inside static method: Second");	
	}  
}
