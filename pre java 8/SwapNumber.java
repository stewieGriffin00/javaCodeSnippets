class Database{
    public static void main(String[] args){
        // swap two variables using temporary variable
        int a = 10, b = 20, c;
        System.out.println(a);
        System.out.println(b);
        c  = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}