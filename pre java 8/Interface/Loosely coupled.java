  //       System.out.println(" method 1"); 
class Database{
    public static void main(String[] args){
        Java java1 = new Java();
        Python py1  = new Python();
        Student ob1 = new Student(" harry potter ",java1);
        Student ob2 = new Student(" Clark Kent ",py1);
        ob1.showCourse();
        ob2.showCourse();
    }
}

interface course{
    void showPrice();
}

class Student{
    String name;
    course c;
    Student(String name){
        this.name  = name;
    }
    Student(String name, course c){
        this.name  = name;
        this.c = c;
    }
    void showCourse(){
        c.showPrice();
    }
}

class Java implements course{
    public void showPrice(){
        System.out.println("Java, price is Rs. 30,000 ");
    }
}

class Python implements course{
    public void showPrice(){
        System.out.println("Python, price is Rs. 20,000 ");
    }
}