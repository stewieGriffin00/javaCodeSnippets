// System.out.println();
class Database{
    public static void main(String[] args)  {
		try{
			fun();
		}	
		catch(ArithmeticException be){
			System.out.println(" main method catch block ");
			System.out.println(be.getMessage());
		}
	}
	public static void fun(){
		try{
			throw new ArithmeticException(" arithmetic exception inside fun method try block ");
		}
		catch(ArithmeticException ae){
			System.out.println(" fun method catch block ");
			System.out.println(ae.getMessage());
			throw ae;
		}
	}
}


