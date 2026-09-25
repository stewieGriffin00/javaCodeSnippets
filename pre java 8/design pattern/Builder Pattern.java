class BuilderPattern{
    public static void main(String[] args){
        Student student1 = Student.getStudent().setName("harry potter").setId(123).build();
        System.out.println(student1);
        Student student2 = Student.getStudent().setName("Batman ").setId(7557).build();
        System.out.println(student2);
    } 
}

class Student{
    private String name;
    private int id;
    private Student(){}
    static Student getStudent(){
        return new Student();
    }
    Student setName(String name){
        this.name = name;
        return this;
    }
    Student setId(int id){
        this.id = id;
        return this;
    }
    Student build(){
        return this;
    }
    @Override
    public String toString(){
        return " Name:"+name+"\n Id: "+id;
    }
}