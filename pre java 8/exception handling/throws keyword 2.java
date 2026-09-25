// System.out.println();
class Database{
    public static void main(String[] args)  {
		try{
			fun();
		}	
		catch(InterruptedException iE){
			System.out.println(" caught InterruptedException in main method catch block ");
		}
	}
	/* public static void fun(){
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException iE){
			System.out.println(" caught InterruptedException in main method catch block ");
		}
		System.out.println(" two seconds ");
	} */
	public static void fun() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println(" two seconds ");
	}
}
	// thread sleep throws InterruptedException so we have to handle it with try and catch block
	// in the block where it is found itself.
	// or declare the method, that has that statement as throws InterruptedException.
	// 	there are two ways to do it  
	// here in fun method i have used thread.sleep (2000) and did not handle it in the fun 
	//  method but I have declared it as throws InterruptedException in method signature 
	// Since the thread sleep  method didn't cause an exception handling it in main method 
	// is unnnecessary. But it is best practice what if it causes an exception.
	//  in the commented code in this file we see another version of this code,
	// where I have handled the exception in the fun() method itself so declaring  it in the 
	//  method signature of that method is unneccessary.

