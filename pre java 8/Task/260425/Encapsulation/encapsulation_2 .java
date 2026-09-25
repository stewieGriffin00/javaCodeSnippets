class Student{
    private String name;
    private int age;
    private char grade;
    Student(String name, int age, char grade){
        this.name = name;
        this.grade = grade;
        this.age = age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setGrade(char grade){
        this.grade = grade;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    char getGrade(){
        return grade;
    }
    void printDetails(){
        System.out.println(" name: "+name+"\nage: "+age+"\nGrade:"+grade);
    }
}

class Encapsulation2{
    public static void main(String[] args){
        System.out.println(" Encapsulation Task 2 ");
        Student ch1 = new Student(" harry potter ",15,'A');
        ch1.printDetails();
        ch1.setName("Harry");
        ch1.setAge(16);
        ch1.setGrade('B');
        ch1.printDetails();
    }
}

