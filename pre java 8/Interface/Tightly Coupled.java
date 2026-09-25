  //       System.out.println(" method 1"); 
class Database{
    public static void main(String[] args){
        Java java1 = new Java();
        Student ob1 = new Student(" harry potter ",java1);
        ob1.showCourse();
    }
}

class Student{
    String name;
    Java j;
    Student(String name, Java j){
        this.name  = name;
        this.j = j;
    }
    void showCourse(){
        j.showPrice();
    }
}

class Java{
    public void showPrice(){
        System.out.println("Java, price is Rs. 30,000 ");
    }
}
