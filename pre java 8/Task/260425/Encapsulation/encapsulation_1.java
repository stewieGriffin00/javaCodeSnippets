import java.lang.reflect.Field;
import java.util.Scanner;

class Children{
    private String name;
    private int rollNo;
    private char grade;
    Children(String name, int rollNo, char grade){
        this.name = name;
        this.grade = grade;
        this.rollNo = rollNo;
    }
    void setName(String name){
        this.name = name;
    }
    void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    void setGrade(char grade){
        this.grade = grade;
    }
    String getName(){
        return name;
    }
    int getRollno(){
        return rollNo;
    }
    char getGrade(){
        return grade;
    }
    void printDetails(){
        System.out.println(" name: "+name+"\nrollNO: "+rollNo+"\nGrade:"+grade);
    }
}

class Encapsulation1{
    public static void main(String[] args){
        System.out.println(" Encapsulation Task 1 ");
        Children ch1 = new Children(" harry potter ",10001,'A');
        ch1.printDetails();
        ch1.setName("Harry");
        ch1.setRollNo(200001);
        ch1.setGrade('B');

        ch1.printDetails();
        Field[] field=ch1.getClass().getDeclaredFields();
        for(Field fields:field)
        {
            if(field.getName.equals(name))
            {
                field.setAccessible(true);
                field.set(ch1,"jafar");
            }
        }
System.out.println(ch1.name);
    }
}

