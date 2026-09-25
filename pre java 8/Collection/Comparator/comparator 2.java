import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        Student student2 = new Student(11, "name2");
        Student student1 = new Student(10, "name1");
        Student student3 = new Student(12, "name3");
        Student student4 = new Student(15, "name4");
        Student student5 = new Student(19, "name5");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Collections.sort(students, new StudentComparator());

        System.out.println(students); // all student objects will be arranged in descending order based on the age
    } 
}

class StudentComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if(s1.age < s2.age)
            return 1;
        else if(s1.age == s2.age)
            return 0;
        else if(s1.age > s2.age)
            return -1;
        return 0;
    }
}

class Student{
    int age;
    String name;

    Student(int age, String name){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return " name:"+ name+ " age: "+age;
    }
}