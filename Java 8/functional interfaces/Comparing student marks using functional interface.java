import java.util.ArrayList;
class Main{
   public static void main(String[] args){
      ArrayList<Student> studentsList = new ArrayList<>();
      Student student1 = new Student(100,"Scahin");
      Student student2 = new Student(120,"Dhoni");
      Student student3 = new Student(125,"Virat");
      Student student4 = new Student(105,"Dravid");
      Student student5 = new Student(130,"Raina");

      studentsList.add(student1);
      studentsList.add(student2);
      studentsList.add(student3);
      studentsList.add(student4);
      studentsList.add(student5);

      ComparingInterface ci = (ArrayList<Student> a, int m)->{
         for(Student s: a){
            if(s.marks> m){
               System.out.println(s);
            }
         }
      };
      ci.filter(studentsList, 110);
   }
}

@FunctionalInterface
interface ComparingInterface{
   void filter(ArrayList<Student> a, int m);
}

class Student{
   int marks;
   String name;
   int getMarks(){
      return marks;
   }
   Student(int marks, String name){
      this.marks = marks;
      this.name = name;
   }
   @Override
   public String toString(){
      return " name: "+name+"\n marks: "+marks;
   }
}