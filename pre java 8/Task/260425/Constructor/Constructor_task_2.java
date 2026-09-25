class StudentClass{
    public static void main(String[] args){
        System.out.println(" Student Class ");
        Student student1 = new Student(1110,450,"Sachin");
        Student student2 = new Student(1111,456,"Dhoni");
        Student student3 = new Student(1112,430,"Kohli");
        student1.displayFields();
        student2.displayFields();
        student3.displayFields();
    }
}

class Student{
    String name;
    int rollNo, marks;
    Student(int rollNo, int marks, String name){
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }
    void displayFields(){
        System.out.println(" name: "+name+" rollNo: "+rollNo+" marks: "+marks);
    }
}



