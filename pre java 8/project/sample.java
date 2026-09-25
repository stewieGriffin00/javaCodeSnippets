// System.out.println(); 
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.ListIterator;

class Main{
   public static void main(String[] args){
        ArrayList<Posts> posts = new ArrayList<Posts>();
    
        Random raNum = new Random();
        ArrayList<Creators> creators = new ArrayList<Creators>();
        Creators creator1 = new Creators("name1","abc123", raNum.nextInt());
        creators.add(creator1);
        Creators creator2 = new Creators("name2","abc123", raNum.nextInt());
        creators.add(creator2);
        
        creator1.createPost("title 1", "content 1",posts);
        creator1.createPost("title 2", "content 2",posts);
        creator2.createPost("title 3", "content 1",posts);
        creator2.createPost("title 4", "content 2",posts);

        creator2.myPosts(posts);
        for(Posts p: posts){
            System.out.println(p);
        }
        // System.out.println("Login as \n1. Admin\n 2. Creator\n 3. User\n");
        // Scanner sc = new Scanner(System.in);
        // int choice = sc.nextInt();
        // switch(choice){
        //     case 1:
        //         System.out.println("you choose Admin ");
        //         break;
        //     case 2:
        //         System.out.println("you choose Creator ");
        //         break;
        //     case 3:
        //         System.out.println("you choose User ");
        //         break;
        //     default:
        //         System.out.println("enter only between 1 and 3");
        // }

   }  
}

class Accounts{
    String name, password;
    int userId;
    @Override
    public String toString(){
        return "name: "+name+" \nuser Id: "+userId;   
    }
}

class Creators extends Accounts{
    static Random raNum = new Random();
    static ArrayList<Posts> p;
    static int num;
    static Scanner sc = new  Scanner(System.in);
    static String edit = null;

    ArrayList<Integer> myPosts = new ArrayList<Integer>();

    Creators(String name, String password, int userId){
        this.name = name;
        this.password = password;
        this.userId = userId;
    }

    void createPost(String title, String content, ArrayList<Posts> p){
        num = raNum.nextInt(1001,9999);
        p.add(new Posts(title, content ,name, num));
        myPosts.add(num);
    }

    void myPosts(ArrayList<Posts> p){
        for(Posts po: p){
            if(po.creatorId==this.name){
                po.displayPost();
                System.out.println("1. delete 2. update 3. next post");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        deletePost(p);
                        break;
                    case 2:
                        updatePost(p);
                        break;
                    case 3:
                        continue;
                    default:
                        System.out.println("you can enter only 1 or 2 ");
                        break;
                }
            }
        }
    }

    void deletePost(ArrayList<Posts> p){
        int count = 0;
        for(Posts po: p){
            if(po.creatorId==this.name){
                po.displayPost();
            }
        }
        System.out.println("enter the post Id to delete it");
        int choice = new Scanner(System.in).nextInt();
        for(Posts po: p){
            count++;
            if(po.creatorId==name && choice == po.postId){
                break;
            }
        }
        p.remove(count-1);
        myPosts(p);
    }

    void updatePost(ArrayList<Posts> p){
        int count = 0;
        Posts p1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter post Id to update it ");
        int postNum = new Scanner(System.in).nextInt();
        System.out.println("1. update title 2. update content ");
        int choice = sc.nextInt();
        System.out.println(" you entered: "+choice);
        switch(choice){
            case 1:
                System.out.println(" enter new title ");
                edit = sc.nextLine();
                sc.nextLine();
                break;
            case 2: 
                System.out.println(" enter new content ");
                edit = sc.nextLine();
                sc.nextLine();
                break;
            default:
                System.out.println("enter only 1 or 2 ");
                break;
        }
        // for(Posts po: p){
        //     count++;
        //     if(po.creatorId == this.name && postNum == po.postId){
        //         break;
        //     }
        //     count--;
        //     if(choice == 1){    
        //         p1 = p.get(count);
        //         p1.title = edit;
        //     }
        //     else if (choice == 2){
        //         p1 = p.get(count);
        //         p1.content = edit;
        //     }
        ListIterator<Posts> li = p.listIterator();
        while(li.hasNext()){
            count++;
            if(li.next().creatorId == this.name && postNum == li.next().postId){
                if(choice == 1){
                    li.next().title = edit;
                }
                else if(choice == 2){
                    li.next().content = edit;
                }
                break;
            }
        }
    }
}

// class Admins extends Accounts{

// }

// class Users extends Accounts{

// }

class Posts{
    String title, content, creatorId;
    int postId;
    Posts(String title, String content, String creatorId, int postId){
        this.title = title;
        this.content = content;
        this.creatorId = creatorId;
        this.postId = postId;
    }
    void displayPost(){
        System.out.println(" ---------------------\n "+title.toUpperCase()+": \n\t"+ content+"\n creator: "+creatorId+" post Id: "+postId+" \n---------------------");
    }
}

