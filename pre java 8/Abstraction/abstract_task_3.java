class AbstractMain{
    public static void main(String[] args){
        Developer dvlper1 = new Developer();
        dvlper1.getRole();
        dvlper1.getSalary();
        dvlper1.getWorkHours();
        System.out.println("_____________________\n");

        Manager manager1 = new Manager();
        manager1.getRole();
        manager1.getSalary();
        manager1.getWorkHours();
    }
}

abstract class Employee{
    abstract void getSalary();
    abstract void getRole();
    abstract void getWorkHours();
}

class Manager extends Employee{
    void getSalary(){
        System.out.println(" Salary: 80,000");
    }
    void getRole(){
        System.out.println(" Role: Manager");
    }
    void getWorkHours(){
        System.out.println(" Work Hours: 8hrs");
    }
}

class Developer extends Employee{
    void getSalary(){
        System.out.println(" Salary: 40,000");
    }
    void getRole(){
        System.out.println(" Role: Developer");
    }
    void getWorkHours(){
        System.out.println(" Work Hours: 12hrs");
    }
}