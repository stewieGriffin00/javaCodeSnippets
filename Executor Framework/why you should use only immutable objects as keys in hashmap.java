
import java.util.HashMap;


class sample {
    public static void main(String[] args) throws Exception {
        Student s1= new Student(10, "batman");
        Student s2= new Student(11, "superman");

        HashMap<Student, String> hs= new HashMap<>();

        hs.put(s1, "batman");
        hs.put(s2, "superman");

        System.out.println("\n getting value of batman \n \n "+hs.get(s1));
        
        s1.name= "hulk";
        s1.age= 20;
        System.out.println("\n changing batman name \n");
        System.out.println("\n getting value of batman \n \n "+hs.get(s1));

    }
}

class Student {

    // int age;
    // String name;
 
    final int age;
    final String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        if (age != other.age) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}
