// System.out.println();
import java.util.Scanner;
class Database{
    public static void main(String[] args) {
        int m= 100;
       
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("ENd");
	}
}

// class NewUncheckedException extends RunTimeException{
class NewcheckedException extends Exception{
    public void NewCheckedException( String msg ){
        super(msg);
    }
    // NewCheckedException(){}
}