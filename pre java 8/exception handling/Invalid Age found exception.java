// System.out.println();
class Database{
    public static void main(String[] args){
		Class1 ob1 = new Class1();
		try{
			ob1.setAge(18);	
		}
		catch(InvalidAgeFoundException iAF){
			System.out.println(iAF.getMessage());
		}
	}
}

class InvalidAgeFoundException extends Exception{
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