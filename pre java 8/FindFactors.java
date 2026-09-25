class FindFactors{
	public static void main(String[] args){
		int number = 67 , count=0;		
        for(int i=number; i>=1; i--){
		if(number%i==0){
			 System.out.println(i);
			 count++;
			}
		}
		System.out.println("count is: "+count);
	}	
}
