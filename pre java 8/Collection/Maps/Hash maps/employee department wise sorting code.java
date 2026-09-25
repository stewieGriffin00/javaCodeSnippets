import java.util.HashMap;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        ArrayList<String> itEmployeeNames = new ArrayList<String>();
        ArrayList<String> hrEmployeeNames = new ArrayList<String>();
        ArrayList<String> marketingEmployeeNames = new ArrayList<String>();

        Employee employee1 = new Employee("IT", "jagan"); 
        Employee employee2 = new Employee("IT","jayraj"); 
        Employee employee3 = new Employee("IT","hardik"); 
        Employee employee4 = new Employee("HR","rahul"); 
        Employee employee5 = new Employee("HR","deepak"); 
        Employee employee6 = new Employee("HR","akash"); 
        Employee employee7 = new Employee("Marketing","jaffer"); 
        Employee employee8 = new Employee("Marketing","jeeva"); 
        Employee employee9 = new Employee("Marketing","janvirha");
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.add(employee9);
        
        HashMap<String, ArrayList<String>> list = new HashMap<String, ArrayList<String>>();
        
        for(Employee e: employeeList){
            if(e.dept == "IT"){
                itEmployeeNames.add(e.name);
            }
            else if(e.dept == "HR"){
                hrEmployeeNames.add(e.name);
            }
            else if(e.dept == "Marketing"){
                marketingEmployeeNames.add(e.name);
            }
        }

        list.put("IT", itEmployeeNames);
        list.put("HR", hrEmployeeNames);
        list.put("Marketing", marketingEmployeeNames);

        System.out.println(list);
            
        
    }
}

class Employee{
    String dept, name;
    Employee(String dept, String name){
        this.dept = dept;
        this.name = name;
    }
}
