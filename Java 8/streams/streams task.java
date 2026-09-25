import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

class Main{
   public static void main(String[] args){
      Employee emp1 = new Employee(1001,"Dhoni", "Production", 44000.24, "Kolkata", 40);
      Employee emp2 = new Employee(1002, "Sachin", "Quality", 34000.56, "Mumbai", 50);
      Employee emp3 = new Employee(1003, "Raina", "Designing", 78000.23, "Chennai", 35);
      Employee emp4 = new Employee(1004, "Dravid", "Designing", 40987.22, "Bengaluru", 50);
      Employee emp5 = new Employee(1005, "Ashwin", "Production", 88766.54, "Chennai", 40);
      
      EmployeeList emList = new EmployeeList();
      emList.add(emp1); emList.add(emp2); emList.add(emp3); emList.add(emp4); emList.add(emp5);

      // System.out.println(Arrays.toString(emList.employees));

      // hihgest paid employee
      // System.out.println(Arrays.stream(emList.employees).sorted((x,y)-> (int) y.getSalary() - (int) x.getSalary()).findFirst().get());

      // top three highest paid employees
      // Arrays.stream(emList.employees).sorted((x,y)-> (int)y.getSalary()- (int)x.getSalary()).limit(3).forEach(System.out::println);

      // all employees older than 25 
      // System.out.println(Arrays.stream(emList.employees).allMatch(x-> x.getAge()>25));

      // Map<Integer , List<Employee>> m = Arrays.stream(emList.employees).collect(Collectors.groupingBy(x-> { int m= 60000; return int(x.getSalary())>m; }));
      // System.out.println(m);

      // youngest employee
      // System.out.println(Arrays.stream(emList.employees).sorted((x,y)-> x.getAge()- y.getAge()).findFirst().get());

      // filter the employees earing more than 60,000 and sort them descending order.
      // Arrays.stream(emList.employees).filter(x-> x.getSalary()> 60000).sorted((x,y)-> {int m; m =(int) (y.getSalary()- x.getSalary()); return m;}).forEach(System.out::println);

      // Map<String, List<Employee>> groupedByDepartment =  Arrays.stream(emList.employees).collect(Collectors.groupingBy(x-> x.getDepartment()));

      // System.out.println(groupedByDepartment);

      // divide employees based on their salary if is more than 60,000 or not.
      // Map<String, List<Employee>> groupedBasedOnSalary=  Arrays.stream(emList.employees).collect(Collectors.groupingBy(x->  (x.getSalary()> 60_000)?" More than 60,000":" Less Than 60,000"));
      // System.out.println(groupedBasedOnSalary);

      // average age per city
      // Map<String, Double> groupedByCity = Arrays.stream(emList.employees).collect(Collectors.groupingBy(x-> x.getCity(), Collectors.averagingDouble(x-> x.getSalary())));
      
      // System.out.println(groupedByCity);

      // average age by department
      // Map<String, Double> averageAgeByDepartment = Arrays.stream(emList.employees).collect(Collectors.groupingBy(x-> x.getDepartment(), Collectors.averagingInt(u-> u.getAge())));

      // System.out.println(averageAgeByDepartment);

      // average age by city
      // Map<String ,Double> groupedByCityandSalary= Arrays.stream(emList.employees).collect(Collectors.groupingBy(x-> x.getCity(), Collectors.averagingDouble(x-> x.getSalary())));

      // System.out.println(groupedByCityandSalary);

      
   }
}

class Employee{
   private int id;
   private  String name;
   private String department;
   private double salary;
   private String city;
   private int age;

   int getAge(){
      return age;
   }

   void setAge(int age){
      this.age = age;
   }

   int getId(){
      return id;
   }

   void setId(int id){
      this.id = id;
   }

   double getSalary(){
      return salary;
   }

   void setId(double salary){
      this.salary = salary;
   }

   String getCity(){
      return city;
   }

   void setCity(String city){
      this.city= city;
   }

   String getDepartment(){
      return department;
   }

   void set(String department){
      this.department= department;
   }

   String getName(){
      return name;
   }

   void setName(String name){
      this.name= name;
   }

   public String toString(){
      return "\n--------"+"\n name: "+this.getName()+ "\n id: "+this.getId()+"\n department:  "+this.getDepartment()+"\n salary: "+this.getSalary()+"\n City: "+this.getCity()+"\n Age: "+this.getAge()+" \n--------\n\n";
   }

   Employee(int id, String name, String department, double salary, String city, int age){
      this.id= id;
      this.name= name;
      this.department= department;
      this.age= age;
      this.salary= salary;
      this.age= age;
      this.city= city;
   }
}

class EmployeeList{
   Employee[] employees= new Employee[0];
   int count= -1;
   void add(Employee em){
      count++;
      employees = Arrays.copyOf(employees, (employees.length)+1);
      employees[count] = em; 
   }

   @Override 
   public String toString(){
      if(employees[employees.length-1]== null){
         employees= Arrays.copyOf(employees, employees.length-1);
      }
      return Arrays.toString(employees);
   }

}