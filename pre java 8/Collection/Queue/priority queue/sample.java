import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Iterator;


class Main{
    public static void main(String[] args){
        Student student2 = new Student(11, "Dhoni");
        Student student1 = new Student(10, "Sachin");
        Student student3 = new Student(12, "Raina");
        Student student5 = new Student(19, "Ashwin");
        Student student4 = new Student(15, "Dravid");

        StudentComparator sc1 = new StudentComparator();

        PriorityQueue<Student> students = new PriorityQueue<Student>(sc1);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Iterator it = students.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        
    } 
}

class StudentComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if(s1.getName() < s2.getName())
            return 1;
        else if(s1.getName() == s2.getName())
            return 0;
        else if(s1.getName() > s2.getName())
            return -1;
        return 0;
        
    }
}

class Student{
    Integer age;
    String name;

    Student(int age, String name){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return " name:"+ name+ " age: "+age;
    }

    String getName(){
        return name;
    }
}