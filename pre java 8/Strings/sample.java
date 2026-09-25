
class Database{
    public static void main(String[] args)/*  throws InvalidAgeFoundException */{
		Class1 ob1 = new Class1();
		// try{
			// ob1.setAge(18); // this will throw the exception	
			ob1.setAge(19);	// this will not throw the exception 
		// }
		// catch(InvalidAgeFoundException iAF){
			// System.out.println(iAF.getMessage());
		// }
	}
}

// class InvalidAgeFoundException extends Exception{
class InvalidAgeFoundException extends RuntimeException{
	public InvalidAgeFoundException(String msg){
		super(msg);
	}
}

class Class1{
	private int age;
	public void setAge(int age) throws InvalidAgeFoundException{
		if(age<19){
			throw new InvalidAgeFoundException(" enter age above 18 ");
		}
		System.out.println(" new age: "+age);
	}
}


