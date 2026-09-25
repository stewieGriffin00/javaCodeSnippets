package objectclass;
class Database{
    public static void main(String[] args){
        Database ob1 = new Database();
        System.out.println("\t"+ob1.getClass().getName());
        System.out.println("\t"+ob1.hashCode());
        System.out.println("\t"+ob1);
        String hexaDecimal = Integer.toHexString(ob1.hashCode());
        System.out.println("\t hexadecimal: "+hexaDecimal);
    }
}

/*  If we invoke the toSting() method we get the fully qualified class name along with the 
    hash code converted to hexa decimal 
    That is why we convert the hash code to hexa decimal manually using the Integer.toHexString()
 */
