import java.util.Optional;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Optional<String> op1 = Optional.ofNullable("java");
        // Optional<String> op2 = Optional.ofNullable(null);
        
        // System.out.println(op1.isPresent());
        // System.out.println(op2.isPresent());

        // System.out.println(op1.orElse("python"));
        // System.out.println(op2.orElse("python"));

        // System.out.println(op1.orElseGet(()->(" else get message ")));
        // System.out.println(op2.orElseGet(()->(" else get message ")));

        // op1.ifPresent(i->System.out.println(" if present method "));
        // op1.ifPresent(i->System.out.println("it contains "+op1/* .get() */));
        // op2.ifPresent(i->System.out.println(" if present method "));

        // ArrayList<Optional<String>> al = new ArrayList<>();

        // al.add(Optional.ofNullable(null));
        // al.add(Optional.ofNullable("static"));
        // al.add(Optional.ofNullable("instance"));

        // System.out.println(al);

        
    }
}

