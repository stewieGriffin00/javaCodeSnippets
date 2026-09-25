import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static  void main(String[] args){
        Student student3 = new Student(12);
        Student student4 = new Student(14);
        Student student2 = new Student(11);
        Student student1 = new Student(10);
        Student student5 = new Student(9);
        Student student6 = new Student(16);

        Comp comp = new Comp();

        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student6);
        studentsList.add(student5);

        Collections.sort(studentsList, comp);

        System.out.println(studentsList);

    }
}

class Student{
    int age;
    Student(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return " age: "+age;
    }
}

class Comp implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.age - b.age; 
    }
}