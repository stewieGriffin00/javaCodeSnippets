class EmployeeMain{
    public static void main(String[] args){
        Manager manager1  = new Manager("Dhoni",4);
        Manager manager2  = new Manager("Sachin",5);
        Programmer prog1 = new Programmer("Virat Kohli",4);
        Programmer prog2 = new Programmer("Suresh Raina",3);
        Developer devlp1 = new Developer("Ashwin",3); 
        Developer devlp2 = new Developer("Dravid",6); 
        manager1.employeeDetails();
        manager2.employeeDetails();
        prog1.employeeDetails();
        prog2.employeeDetails();
        devlp1.employeeDetails();
        devlp2.employeeDetails();
        System.out.println(" Bonus for employee Dhoni: "+manager1.calculatingBonus());
        System.out.println(" Bonus for employee Sachin: "+manager2.calculatingBonus());
        System.out.println(" Bonus for employee Ashwin: "+devlp1.calculatingBonus());
        System.out.println(" Bonus for employee Kohli: "+prog1.calculatingBonus());
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