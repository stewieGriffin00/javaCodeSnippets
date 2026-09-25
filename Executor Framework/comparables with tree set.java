import java.util.TreeSet;

class sample {

    public static void main(String[] args) {
        Student s2= new Student(15, "zod");
        Student s3= new Student(5, "superman");
        Student s1= new Student(10, "batman");
        Student s4= new Student(10, "flash");

        TreeSet<Student> studentsSet = new TreeSet<>();

        studentsSet.add(s2);
        studentsSet.add(s1);
        studentsSet.add(s3);
        studentsSet.add(s4);

        System.out.println(studentsSet);

    }
}


class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name= name;
    }
    
    public String toString(){
        return "\n age: "+age+ "  "+ name;
    }

    @Override
    public int compareTo(Student o) {
        int c= Integer.compare(this.age, o.age);
        
        return c== 0? (this.name).compareTo(o.name): c;
    }
}