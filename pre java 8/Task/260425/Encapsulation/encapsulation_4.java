class NewStudent{
    private String name;
    private int age;
    private char grade;
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        if(age<=5 || age>= 100){
            System.out.println("Invalid Age \n you entered: "+age);
            return;
        }
        this.age = age;
    }
    void setGrade(char grade){
        if(grade >= 'G'){
            System.out.println("Invalid Grade \n you entered: "+grade);
            return;
        }
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

class Encapsulation4{
    public static void main(String[] args){
        System.out.println(" Encapsulation Task 4 ");
        NewStudent student1 = new NewStudent();
        student1.setName("Clark Kent");
        student1.setAge(120);
        student1.setGrade('H');
        student1.printDetails();
    }
}

