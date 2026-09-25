// System.out.println();
import java.util.Scanner;
class Database{
    public static void main(String[] args) {
		System.out.println(" enter new user Id. ");
		String id = new Scanner(System.in).next();
		Users ob1 = new Users();
		try{
			ob1.signUp(id);
		}
		catch(UserExistsAlready uEA){
			System.out.println(" error message "+uEA.getMessage());
		}
	}
}

class UserExistsAlready extends Exception{
	public UserExistsAlready(String msg){
		super(msg);
	}
}

class Users{
	String[] users = {"user1","user2","user3"};
	String newUSer = null;
	public void signUp(String id1) throws UserExistsAlready{
		newUSer = id1;
		for(int i=0; i<users.length; i++){
			if(id1.equals(users[i])){
				throw new UserExistsAlready(" user already exists ");
			}
		}
		System.out.println(" new user: "+newUSer);
	}
}
