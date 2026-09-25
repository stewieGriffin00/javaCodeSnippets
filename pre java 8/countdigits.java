class Database{
	// Count Odd digits
	  public static void  main(String[] args)
	{	
		int n = 847584854;
		int r;
		int c = 0;
		while(n>0){
			r = n%10;
			if(r%2==0){
				c++;
			}
		n = n/10;
		}				
		System.out.println(c);		
	}
}
