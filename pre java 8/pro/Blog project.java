import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice,num, pswrd;
        ArrayList<Admin> admins = new ArrayList<Admin>();
        Admin admin1 = new Admin(100," admin 1", 0000);
        admins.add(admin1);
        Admin admin2 = new Admin(101," admin 2", 0000);
        admins.add(admin2);

        ArrayList<Creator> creators = new ArrayList<Creator>();
        Creator creator1 = new Creator(201, "creator 1", 0000);
        Creator creator2 = new Creator(202, "creator 2", 0000);
        creators.add(creator1);
        creators.add(creator2);

        ArrayList<Posts> posts = new ArrayList<Posts>();
        posts.add(new Posts(401,201,"title 1","post 1 by creator 1"));
        posts.add(new Posts(402,201,"title 2","post 2 by creator 1"));
        posts.add(new Posts(403,202,"title 1","post 1 by creator 2"));
        posts.add(new Posts(404,202,"title 2","post 2 by creator 2"));
        displayAllPosts(posts);

        System.out.println(" enter as \n1. admin \n2. creator \n3. user ");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                Admin admin = admins.get(login(admins)-1);
                System.out.println(" you chose "+admin);
                if(verifyPassword(admin)){
                    System.out.println(" correct password");
                    while(true){
                        switch(admin.menu()){
                            case 4:
                                displayAllPosts(posts);
                                break;
                            case 3:
                                System.out.println(" you chose delete posts");
                                displayAllPosts(posts);
                                System.out.println("enter the serial number of the post you want to delete it");
                                num = sc.nextInt();
                                System.out.println("you enterd "+num);
                                admin.deletePosts(posts, num-1);
                                break;
                            case 2:
                                System.out.println(" you selected view all creators");
                                viewAllCreators(creators);
                                break;
                            case 1:
                                System.out.println(" you chose delete creators ");
                                viewAllCreators(creators);
                                System.out.println("enter serial number of creator you want to delete");
                                num = sc.nextInt();
                                System.out.println("you enterd "+num);
                                admin.deleteCreator(creators, num-1, posts);                                
                                break;
                            default:
                                System.out.println("only enter 1, 2, 3 or 4");
                        }
                        System.out.println("if you want to continue enter 1");
                        int i = new Scanner(System.in).nextInt();
                        if(i != 1){
                            break;
                        }
                    }
                }
                else{
                    System.out.println(" wrong password");
                    break;
                }
                break;

            case 2:
                Creator c = creators.get(login(creators)-1);
                System.out.println(" you chose "+c);
                if(verifyPassword(c)){
                    while(true){
                        switch(c.menu()){
                            case 1: 
                                c.createPost(posts);
                                displayAllPosts(posts);
                                break;
                            case 2:
                                c.readMyPosts(posts);
                                break;
                            case 3:
                                c.deletePosts(posts);
                                c.readMyPosts(posts);
                                break;
                            case 4:
                                c.updatePost(posts);
                                break;
                            default:
                                System.out.println("enter only 1, 2, 3 or 4 ");
                        }
                    System.out.println("if you want to continue enter 1");
                    int i = new Scanner(System.in).nextInt();
                    if(i != 1){
                        break;
                    }
                }
                }
                else{
                    System.out.println(" wrong password");
                    break;
                }
            break;

            default:
                System.out.println("enter only 1 , 2 or 3 ");
        }
    }   

    static int login(ArrayList<? extends Accounts> lt){
        int count=0;
        for(Accounts ac: lt){
            System.out.println((count+1)+". "+ac);
            count++;
        }
        System.out.println("enter your account serial number");
        return new Scanner(System.in).nextInt();
    } 

    static boolean verifyPassword(Accounts ac){
        System.out.println("enter your password");
        int pswd = new Scanner(System.in).nextInt();
        return ((ac.password) == pswd)?true:false;
    } 

    static void displayAllPosts(ArrayList<Posts> posts){
        int serialnum=0;
        for(Posts p: posts){
            System.out.println("\n---------");
            System.out.println(" s.no "+(serialnum+1));
            System.out.println(p);
            System.out.println("\n---------");
            serialnum++;
        }
    }

    static void viewAllCreators(ArrayList<Creator> creators){
        int serialnum=0;
        for(Creator c: creators){
            System.out.println("\n---------");
            System.out.println(" s.no "+(serialnum+1));
            System.out.println(c);
            System.out.println("\n---------");
            serialnum++;
        }
    }
}

class Posts{
    int postId, creatorId;
    String title, content;

    Posts(int postId, int creatorId, String title, String content){
        this.title = title;
        this.content = content;
        this.creatorId = creatorId;
        this.postId = postId;
    }

    @Override
    public String toString(){
        return "post ID:"+postId+"\ncreator Id: "+creatorId+"\n title: "+title+"\n content: "+content;
    }
}

class Accounts{
    int userId, password;
    String name;
    @Override
    public String toString(){
        return " userId: "+userId+" \nname:"+name;
    }
}

class Admin extends Accounts{
    Admin(int userId, String name, int password){
        this.userId = userId;
        this.name = name;
        this.password = password;
    }
    int menu(){
        System.out.println(" 1. delete creators \n2. view creators \n3. delete posts \n4. view posts");
        return new Scanner(System.in).nextInt();
    }
    void deletePosts(ArrayList<Posts> posts, int num){
        posts.remove(num);
    }
    void deleteCreator(ArrayList<Creator> creators, int num, ArrayList<Posts> posts){
        Creator c = creators.get(num);
        int creatorId = c.userId;
        int count = 0;
        creators.remove(num);
        ListIterator<Posts> li = posts.listIterator();
        while(li.hasNext()){
            if(li.next().creatorId == creatorId){
                li.remove();
            }
        }
    }
}

class Creator extends Accounts{
    static Posts p;
    static String string1, string2;
    static Scanner sc= new Scanner(System.in);
    static Random rNum = new Random();
    static int num;

    Creator(int userId, String name, int password){
        this.userId = userId;
        this.name = name;
        this.password = password;
    }   
    int menu(){
        System.out.println(" Creator Menu: \n1. Create Post \n2. Read my posts \n3. delete \n4. update posts");
        return new Scanner(System.in).nextInt();
    }
    void createPost(ArrayList<Posts> posts){
        System.out.println("enter post title");
        string1 = sc.nextLine();
        System.out.println("enter post content");
        string2 = sc.nextLine();
        posts.add(new Posts(rNum.nextInt(1000,9999),this.userId, string1, string2));
    }

    void readMyPosts(ArrayList<Posts> posts){
        for(Posts p: posts){
            if(p.creatorId == this.userId){
                System.out.println(p);
            }
        }
    }

    void deletePosts(ArrayList<Posts> posts){
        readMyPosts(posts);
        posts.remove(getInput(posts));
    }

    void updatePost(ArrayList<Posts> posts){
        readMyPosts(posts);
        String edit =null;
        int index = getInput(posts);
        Posts p = posts.get(index);
        System.out.println(" 1. edit title\n 2. edit content");
        index = sc.nextInt();
        sc.nextLine();
        if(index == 1){
            System.out.println("enter new title ");
            edit = sc.nextLine();
            p.title = edit;
        }
        else if(index == 2){
            System.out.println("enter new content ");
            edit = sc.nextLine();
            p.content = edit;
        }
        else{
            System.out.println("enter only 1 or 2 ");
        }
        System.out.println(" edited post\n "+p);
    }

    int getInput(ArrayList<Posts> posts){
        System.out.println(" enter the post number ");
        num = sc.nextInt();
        System.out.println(" you entered: "+num);
        int count = 0;
        for(Posts p: posts){
            if(p.creatorId == this.userId && num == p.postId){
                break;
            }
            count++;
        }
        return count;
    }
}


