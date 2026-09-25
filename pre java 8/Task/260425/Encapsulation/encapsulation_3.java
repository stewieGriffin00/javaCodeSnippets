class Employee{
    private String name, role;
    private int id, salary;
    Student(String name, int id, String role, int salary){
        this.name = name;
        this.id;
        this.role = role;
        this.salary = salary;
    }
    void setName(String name){
        this.name = name;
    }
    void setId(int id){
        this.id = id;
    }
    void setRole(String role){
        this.role = role;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
    String getRole(){
        return role;
    }
    int getSalary(){
        return salary;
    }
    void printDetails(){
        System.out.println(" name: "+name+"\nid: "+id+"\nSalary:"+salary+"\n role:"+role);
    }
}

class Encapsulation3{
    public static void main(String[] args){
        System.out.println(" Encapsulation Task 3 ");
        Employee emp1 = new Employee(" BRuce Wayne ",1509,"Manager",30000);
        emp1.printDetails();
        emp1.setName("Clark Kent");
        emp1.setId(3346);
        emp1.setRole(" AAssistant Manager");
        emp1.setSalary(25000);
    }
}

