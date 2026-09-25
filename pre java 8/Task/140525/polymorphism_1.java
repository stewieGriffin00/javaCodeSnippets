class EmployeeMain{
    public static void main(String[] args){
        Employee manager1 = new Manager("Virat Kohli",5);
        manager1.calculatingBonus();
        manager1.employeeDetails();
        Manager manager2 = (Manager) manager1;
        manager2.name = "Sachin";
        manager2.calculatingBonus();
        manager2.employeeDetails();       
    }
}

class Employee{
    int experience, salary;
    String name, role;
    double calculatingBonus(){
        double bonus = experience*(salary*0.01);
        return bonus;
    }

    void employeeDetails(){
        System.out.println(" name: "+name+"\n role: "+role+"\n experience: "+experience+" salary: "+salary);
    }
}

class Manager extends Employee{
    String role = "Manager";
    int salary = 30_000;
    Manager(String name, int experience){
        this.name = name;
        this.experience = experience;
    }
    double calculatingBonus(){
        double bonus = experience*(salary*0.03);
        return bonus;
    }
    void employeeDetails(){
        System.out.println(" name: "+name+"\n role: "+role+"\n experience: "+experience+" salary: "+salary);
    }
}

class Programmer extends Employee{
    String role = "Programmer";
    int salary = 20_000;
    Programmer(String name, int experience){
        this.name = name;
        this.experience = experience;
    }
    double calculatingBonus(){
        double bonus = experience*(salary*0.02);
        return bonus;
    }
    void employeeDetails(){
        System.out.println(" name: "+name+"\n role: "+role+"\n experience: "+experience+" salary: "+salary);
    }

}

class Developer extends Employee{
    String role = "Developer";
    int salary = 22_000;
    Developer(String name, int experience){
        this.name = name;
        this.experience = experience;
    }
    double calculatingBonus(){
        double bonus = experience*(salary*0.01);
        return bonus;
    }
    void employeeDetails(){
        System.out.println(" name: "+name+"\n role: "+role+"\n experience: "+experience+" salary: "+salary);
    }
}