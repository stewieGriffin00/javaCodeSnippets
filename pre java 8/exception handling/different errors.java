// System.out.println();
import java.util.Scanner;
class Database{
    public static void main(String[] args){
        try{
            // System.out.println(1/0);
            String w = null;
            System.out.println(w.length());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(" NullPointerException: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println(" exception: "+e.getMessage());
        }
    }
}

