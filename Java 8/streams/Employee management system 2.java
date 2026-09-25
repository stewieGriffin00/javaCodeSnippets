import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.HashMap;


class Main{
   public static void main(String[] args){    
      ArrayList<Employee> al1 = new ArrayList<>();
      Employee em1 = new Employee(101, "Arun", "IT", 70_000, 30, "Chennai", 2018);
      Employee em2 = new Employee(102, "Bala", "HR", 65_000, 35, "Bangalore", 2016);
      Employee em3 = new Employee(103, "Chitra", "Finance", 80_000, 29, "Mumbai", 2019);
      Employee em4 = new Employee(104, "Divya", "IT", 85_000, 32, "Chennai", 2015);
      Employee em5 = new Employee(105, "Eshwar", "Finance", 76000, 31, "Delhi", 2020);
      Employee em6 = new Employee(106, "Fathima", "Finance", 63_000, 28, "Bangalore", 2021);
      al1.add(em1); al1.add(em2); al1.add(em3); al1.add(em4); al1.add(em5); al1.add(em6);

      // 1. unique departments 
      // al1.stream().map(x->x.branch).distinct().forEach(x->System.out.println(x));

      // 2. count number of employees per department 
      // Map<String , Long> noEmployees = al1.stream().collect(Collectors.groupingBy(x-> x.branch, Collectors.counting()));
      // System.out.println(noEmployees);

      // 3. Average salary per department 
      // Map<String ,Double> averagepersalaryDepartment = al1.stream().collect(Collectors.groupingBy(x-> x.branch, Collectors.averagingInt(y-> y.salary)));
      // System.out.println(averagepersalaryDepartment);

      // 5. employees joined after 2018
      // al1.stream().filter(x-> x.joiningYear > 2018).forEach(System.out::println);
      
      // 6. employee with second highest salary
      // al1.stream().sorted((x,y)->(y.salary - x.salary)).skip(1).limit(1).forEach(x->System.out.println(x));
      
      // 10. sort employees acccording to the salary in descending order
      // al1.stream().sorted((x,y)-> y.salary - x.salary).forEach(System.out::println);
      
      // 12. chennai employee more than 75,000 salary
      // System.out.println(al1.stream().filter(x -> x.city == "Chennai" && x.salary >= 75_000).findAny().get());

            

   }
}

class Employee{
   int id, salary, age, joiningYear;
   String name, branch, city;

   Employee(int id, String name, String branch, int salary, int age, String city, int joiningYear){
      this.id = id;
      this.name = name;
      this.branch = branch;
      this.salary = salary;
      this.age = age;
      this.city = city;
      this.joiningYear = joiningYear;
   }

   @Override
   public String toString(){
      return "\n name: "+name+"\n id: "+id+"\n salary: "+salary;
   }
}