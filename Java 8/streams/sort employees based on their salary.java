import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main{
   public static void main(String[] args){
      Employee emp1 = new Employee(20_000,"name 1");
      Employee emp2 = new Employee(40_000,"name 2");
      Employee emp3 = new Employee(35_000,"name 3");
      Employee emp4 = new Employee(30_000,"name 4");
      Employee emp5 = new Employee(25_000,"name 5"); // third lowest salary
      Employee emp6 = new Employee(15_000,"name 6");

      List<Employee> employeeList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);
      List<Employee> sorted = employeeList.stream().sorted((m,n)->m.salary - n.salary).collect(Collectors.toList());

      System.out.println(sorted.get(2));

   }

}

class Employee{
   int salary;
   String name; 

   Employee(int n, String s){
      salary = n;
      name = s;
   }

   @Override
   public String toString(){
      return " name: "+name+" \n salary: "+salary;
   } 
}