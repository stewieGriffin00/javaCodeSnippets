
class sample {

public static void main(String[] args) throws Exception{
        Student s1= new Student(10, "java");
        Student s2= new Student(10, "java");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1+" "+s2+" "+s1.equals(s2));


    }
}
record Student(int age, String name){

}
