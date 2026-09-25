class Database{
     public static void main(String[] args)
  {	
	System.out.println(" Inside Main function ");  
	salary(100,200);
	System.out.println(salary(200,300));
	int ret = salary(300,400) ;
	System.out.println(ret);
  }
	public static int salary(int a, int b){
		System.out.println(" inside salary function ");
		return 1;
	}
}
