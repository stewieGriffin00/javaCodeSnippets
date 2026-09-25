class Database{
    public static void main(String[] args){
        Employee employee1= new Employee("Harry potter",11234,30_000);
        Employee employee2= new Employee("Peter parker",24484,5_000);
        Employee employee3= new Employee("Bruce wayne",11564,60_000);
        Employee[] employees = new Employee[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
 
         for(Employee emp: employees){
            System.out.println(" name: "+emp.name+" id: "+emp.id+" salary: "+emp.salary);
        } 
    }
}

class Employee{
    String name;
    int salary;
    int id;
    
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}