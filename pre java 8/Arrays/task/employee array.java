//   transpose array    
// public static void main(String[] args)
// System.out.println();
class Database{
    public static void main(String[] args){
        Employee employee1= new Employee("Employee 1 ",11234,30_000);
        Employee employee2= new Employee("Employee 2",24484,5_000);
        Employee employee3= new Employee("Employee 3 ",11564,60_000);
        Employee employee4= new Employee("Employee 4",11564,60_000);
        Employee employee5= new Employee("Employee 5",11564,60_000);

        Employee[] employees = new Employee[5];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
 
         for(Employee emp: employees){
            System.out.println(" name: "+emp.name+" id: "+emp.id+" salary: "+emp.salary);
        } 
    }
}

class Employee{
    String name;
    int salary, id;
    
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}