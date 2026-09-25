// System.out.println();
class Database{
    // public static void main(String[] args)  {
	// 		fun();
	// }

	// public static void fun() throws ArithmeticException{
	// 	System.out.println(10/0);
	// }
    public static void main(String[] args)  {
			try{
				fun();
			}
			catch(ArithmeticException ae){
				System.out.println(" caught an Arithmetic Exception ");
			}
	}

	public static void fun() throws ArithmeticException{
		System.out.println(10/0);
	}
}
	

