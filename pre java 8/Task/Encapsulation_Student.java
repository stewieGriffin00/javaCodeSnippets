class Databse{
    public static void main(String[] args){
        Student student1 = new Student("dhoni",40,'B');
        Student student2 = new Student("Sachin",50,'A');
        Student student3 = new Student("Dravid",51,'C');
        System.out.println(student1.getAge()+" "+student1.getGrade()+" "+student1.getName());
        System.out.println(" we will change the values now ");
        student1.setName("MS dhoni");
        student1.setAge(45);
        student1.setGrade('D');
        System.out.println(student1.getAge()+" "+student1.getGrade()+" "+student1.getName());
    }
}

class Student{
    Student(String n, int ag, char g){
        name = n;
        age = ag;
        grade = g;
    }
    private String name;
    private int age;
    private char grade;
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    char getGrade(){
        return grade;
    }
    void setName(String n){
        name = n;
    }
    void setGrade(char g){
        grade = g;
    }
    void setAge(int age){
        this.age = age;
    }
}