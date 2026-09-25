import java.util.Scanner;
class Database{
    public static void main(String[] args){
        //  System.out.println();
        int numbers1[] = {10,20,30,40,50};
        for(int i=0;i<5;i++){
            System.out.println(i+": "+numbers1[i]);
        }      
        int [] numbers2 = new int[6];
        System.out.println("enter 6 numbers ");
        for(int i=0;i<6;i++){
            System.out.println("enter "+(i+1)+" number");
            int j = new Scanner(System.in).nextInt();
            numbers2[i] = j;
        }
        System.out.println("second array");
        for(int i: numbers2){
            System.out.println(i);
        }
    }
}

