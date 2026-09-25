class Database{
    public static void main(String[] args){
        Student s1 = new Student("harry potter",1000);
        Student s2 = new Student("harry potter",1000);
        Student s3 = new Student("Batman",9435);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s2.hashCode());
    }
}

class Student{
    String name;
    int id;
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override 
    public boolean equals(Object ob){
        Student st = null;
        if(ob instanceof Student){
            st = (Student) ob;
        }
        return (this.name == st.name && this.id == st.id);
    }

    @Override   
    public int hashCode(){
        return 96897;
    }
}
