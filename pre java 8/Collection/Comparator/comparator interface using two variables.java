import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static  void main(String[] args){
        Student student3 = new Student(12, "sachin");
        Student student4 = new Student(14, "dhoni");
        Student student2 = new Student(11, "virat");
        Student student1 = new Student(10, "dravid");
        Student student5 = new Student(9, "sehwag");
        Student student6 = new Student(16, "sehwag");
        Student student6 = new Student(9, "sehwag");

        Comp comp = new Comp();

        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student6);
        studentsList.add(student5);

        System.out.println(" before sorting \n"+studentsList);
        Collections.sort(studentsList, comp);

        System.out.println(" after sorting \n"+studentsList);

    }
}

class Student{
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return " name: "+name+"\n age: "+age;
    }
}

class Comp implements Comparator<Student>{
    public int compare(Student a, Student b){
        // int ageCompare = a.getAge().compareTo(b.getAge());
        // int ageCompare = a.getAge() - b.getAge();
        int ageCompare = (a.getAge() > b.getAge())?1:0;
        int nameCompare = a.getName().compareTo(b.getName());

        return nameCompare == 0? ageCompare:nameCompare; 
    }
}

