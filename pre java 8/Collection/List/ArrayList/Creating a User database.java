import java.util.ArrayList;
import java.util.Scanner;
class ArrayLists{
    static ArrayList<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        users.add(new User("name1",123456789,"password1","nam1@gmail.com"));
        users.add(new User("name2",9876543,"password2","name2@gmail.com"));
        users.add(new User("name3",68939282,"password3","name3@gmail.com"));

        while(true){
            System.out.println(" 1. Create \n2. Read \n3. Update \n4. Delete");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                default:
                    System.out.println("enter only 1 to 4 ");
                    break;
            }
            System.out.println("enter 1 to run again ");
            int m = sc.nextInt();
            if(m!=1){
                System.out.println(" exiting the programme ");
                break;
            }
        }
    }

    static public void create(){
        System.out.println("enter name ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println(" enter password : ");
        String passWord = sc.next();
        System.out.println("enter phone number ");
        int phoneNum = sc.nextInt();
        System.out.println(" enter e mail ");
        String eMail = sc.next();
        sc.nextLine();
        users.add(new User(name, phoneNum, passWord, eMail));

    }

    static public void read(){
        int choice =0;
        for(int i=0; i<users.size(); i++){
            System.out.println((i+1)+". "+(users.get(i)).name);
        }
        System.out.println(" enter a number ");
        choice = sc.nextInt();
        System.out.println(users.get(choice-1));
    }
    
    static public void update(){
        for(int i=0; i<users.size(); i++){
            System.out.println((i+1)+". "+(users.get(i)).name);
        }
        int ra = sc.nextInt();
        ra--;
        System.out.println("1. name\n 2. phone num \n3. password \n4. email");
        int r = sc.nextInt();
        String updated = null;
        System.out.println("enter new value");
        updated = sc.next();
        int ph = 0;
        switch(r){
            case 1: 
                (users.get(ra)).name = updated;
                break;
            case 2:
                ph = Integer.parseInt(updated);
                (users.get(ra)).phoneNum = ph;
                break;
            case 3:
                (users.get(ra)).passWord = updated;
                break;
            case 4:
                (users.get(ra)).eMail = updated;
                break;
            default:
                System.out.println(" enter only between 1 and 4 ");
        }
        System.out.println(" updated details\n"+(users.get(ra)));

    }

    static public void delete(){
        int choice =0;
        for(int i=0; i<users.size(); i++){
            System.out.println((i+1)+". "+(users.get(i)).name);
        }
        System.out.println(" enter a number ");
        choice = sc.nextInt();
        choice--;
        users.remove(choice);
        System.out.println(users);    
    }
}

class User{
    int phoneNum;
    String name;
    String passWord;
    String eMail;
    
    User(String name, int phoneNum, String passWord, String eMail){
        this.name = name;
        this.phoneNum = phoneNum;
        this.passWord = passWord;
        this.eMail = eMail;
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        return " name: "+name+" phone Number: "+phoneNum+" email: "+eMail+" paswword:"+ passWord;
    }
}