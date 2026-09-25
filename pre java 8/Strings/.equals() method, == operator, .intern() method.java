// .equals() method, == operator, .intern() method

class Strings{
    public static void main(String[] args){
        String s1 = "java";
        String s2 = new String("java");
        // System.out.println(s1 == s2); // false

        String s3 = new String("java");
        s3 = s3.intern();
        // System.out.println(s1 == s3); // true

        // System.out.println(s1.equals(s2)); // true

        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = sb1;
        // System.out.println(sb1==sb2); // true
        // System.out.println(sb1.equals(sb2));  // true

        StringBuilder sb3 = new StringBuilder("java");
        StringBuilder sb4 = new StringBuilder("java");
        // System.out.println(sb3==sb4);
        // System.out.println(sb3.equals(sb4)); // false
        // System.out.println(sb3.toString().equals(sb4.toString())); // true
        // System.out.println(sb3.toString().equals("java"));
        // System.out.println(sb3.toString().equals(sb4));

    }
}
/*  When we compare two objects using equals method we only compare the reference in any class Objects. 
    But only in String CLass the equals method is overridden to compare the internal content.
So only if you use equals method to compare two strings it will actuallycompare the internal content. 
    But the equals is not overriden in StringBuilder and StringBuffer class to compare the internal content so you should use .toString() method to convert it to String then invoke .equals() method to compare them.        
 */