// print the fields of 5 object 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class ArrayLists{
    public static void main(String[] args){
        ArrayList<Student> al = new ArrayList<Student>();
        Student ob1 = new Student("name1",'A',20,874575);
        Student ob2 = new Student("name2",'B',19,873255);
        Student ob3 = new Student("name3",'U',22,8725245);
        Student ob4 = new Student("name4",'C',18,235255);
        Student ob5 = new Student("name5",'E',21,825225);

        al.add(ob1);
        al.add(ob2);
        al.add(ob3);
        al.add(ob4);
        al.add(ob5);

        Iterator<Student> i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }        
        
    }
}

class Student{
    int age, rollNo;
    String name;
    char grade;

    Student(String name, char grade, int age, int rollNo){
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    @Override
    public String toString(){
        return " name: "+name +" grade: "+grade + " age: "+ age+ " rollNO: "+ rollNo;
    }

}