import java.io.*;
// import java.io.IOException;
import java.util.Scanner;
class FileHandling{
    public static void main(String[] args) throws IOException{
        
        File f1 = new File("C:\\Users\\ELCOT\\Pictures\\Sample\\file1.txt");
        f1.createNewFile();
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter(f1);
        
        int s1,s2,s3,s4,sTotal,sAverage;
        String name;
        
        System.out.println("enter a student name");
        name = sc.next();
        fw.write("name: "+name);
        // fw.write(name);
        
        System.out.println("enter math marks");
        s1 = sc.nextInt();
        fw.write("\nmaths: "+s1);
        
        System.out.println("enter social marks");
        s2 = sc.nextInt();
        fw.write("\nsocial: "+s2);
        
        System.out.println("enter english marks");
        s3 = sc.nextInt();
        fw.write("\nenglish: "+s3);

        System.out.println("enter tamil marks");
        s4 = sc.nextInt();
        fw.write("\ntamil: "+s4);

        sTotal = s1+s2+s3+s4;
        sAverage = sTotal/4;

        fw.write("\nTotal: "+sTotal);
        fw.write("\nAverage: "+sAverage);

        fw.flush();
       
        sc = new Scanner(f1);
        while(sc.hasNext()){
            System.out.println(sc.next());
        }

    }
}

