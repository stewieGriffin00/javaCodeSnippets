// System.out.println();
import java.util.Scanner;
class Database{
    public static void main(String[] args){
		ATM ob1 = new ATM();
		System.out.println(" enter a amount \n available balance:"+ATM.balance);
		int amount= new Scanner(System.in).nextInt();
			try{
				ob1.withdraw(amount);
			}
			catch(InsufficientBalance iB){
				System.out.println(" caught an InsufficientBalance Exception ");
				System.out.printf("error message: %s",iB.getMessage());
			}
	}
}
class InsufficientBalance extends Exception{
	public InsufficientBalance(String errorMessage){
		super(errorMessage);
	}
}

class ATM{
	static int balance=1000;
	public void withdraw(int amount) throws InsufficientBalance{
		if(balance < amount){
			throw new InsufficientBalance("enter less amount ");
		}
		balance -=amount;
		System.out.println(" new balance: "+balance);
	}
}

	

