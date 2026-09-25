class StudentClass2{
    public static void main(String[] args){
        System.out.println(" Student Class 2 ");
        Student student1 = new Student(18,'A',"Sachin");
        Student student2 = new Student(17,'D',"Dhoni");
        Student student3 = new Student(19,'C',"Kohli");
        student1.displayFields();
        student2.displayFields();
        student3.displayFields();
    }
}

class Student{
    String name;
    int age;
    char grade;
    Student(int age, char grade, String name){
        this(age,name);
        this.grade = grade;
    }
    Student(int age, String name){
        this(name);
        this.age = age;
    }
    Student(String name){
        this.name = name;
    }
    void displayFields(){
        System.out.println(" name: "+name+" age: "+age+" grade: "+grade);
    }
}



