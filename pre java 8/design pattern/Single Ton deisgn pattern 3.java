class SingleTonDesignPattern{
    public static void main(String[] args){
            Student student1 = Student.getStudent();
            student1.setName("name1");
            student1.setId(005);
            student1.getName();
            student1.getId();
            Student student2 = Student.getStudent();
            student2.setName("name2");
            student2.setId(109);
            student2.getName();
            student2.getId();
            System.out.println(student1);
            System.out.println(student2); 
            // we get the same value both times because itis 
            // the same object we access everytime and changing refrence in one object refernce 
            // changes in the other one as well. 
            // this is confirmed by printing the hash code in both reference 
    } 
}

class Student{
    private int id;
    private String name;
   static Student student0= new Student();  
   private Student(){}
   static Student getStudent(){
        if(student0==null){
            System.out.println(" inside the get Student method( that creates object inside the class itself)");
            student0 = new Student();
        }
        return student0;
   }
    void getId(){
        System.out.println(" id: "+id);
   }
    void getName(){
        System.out.println(" name: "+name);
    }
    void setName(String name){
        this.name = name;
    }
    void setId(int id){
        this.id = id;
    }
    public String toString(){
        return "\n name: "+name +"\n Id: "+id+"\n hascode: "+this.hashCode();
    }
}
