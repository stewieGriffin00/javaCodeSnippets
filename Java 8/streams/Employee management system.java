import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class Main{
   public static void main(String[] args){    
      Scanner scanner = new Scanner(System.in);

      // System.out.println(" Menu: \n 1.Add a new employee \n 2. display all employees with a certain name \n 3. delete an employee\n 4. display all employees with salary ascending order\n 5. sort all employees with descending order of salary\n 6. increase the salary by 10percent\n 7. sum all of employees salary\n 8. display all employee list\n 9. employee salary greater than a given amount\n 10. display employee names in upper case.\n");
      // System.out.print("\n\n enter you choice: ");

      // int choice = scanner.nextInt();
      int number;
      String string;
      Random random = new Random();
      Employee em1 = new Employee(random.nextInt(1000,10_000), 10_000, "dhoni");
      Employee em2 = new Employee(random.nextInt(1000,10_000), 20_000, "sachin");
      Employee em3 = new Employee(random.nextInt(1000,10_000), 30_000, "virat");
      Employee em4 = new Employee(random.nextInt(1000,10_000), 40_000, "raina");
      Employee em5 = new Employee(random.nextInt(1000,10_000), 50_000, "dravid");
      
      List<Employee> l1 = new ArrayList<>();
      l1.add(em1); l1.add(em2); l1.add(em3); l1.add(em4); l1.add(em5);

      switch(choice){

         case 1:
            System.out.print(" enter new employee name:");
            string = scanner.next();

            System.out.print(" enter salary:");
            number = scanner.nextInt();

            System.out.println("name: "+name+"\n salary: "+number);

            l1.add(new Employee(random.nextInt(1000,10_000), number, name));
            System.out.println(l1);
            break;

         case 2: 
            System.out.println("enter a name");
            String input = scanner.next();
            l1.stream().filter(y-> (y.name).equals(input)).forEach(x-> System.out.println(x));
            break;

         // case 3:
         //    System.out.println(l1);
         //    System.out.print(" enter employee id to delete him: ");
         //    number = scanner.nextInt();
         //    li.stream().filter(x-> x.id == number).forEach(y->li.remove());
         //    break;

         case 4:
            li.stream().sorted((x,y) -> x.salary-y.salary).forEach(z-> {
               System.out.println(" ascending order in salary ");
               System.out.println(z);});
            break;

         case 5:
            li.stream().sorted((x,y) -> y.salary- x.salary).forEach(z-> {
               System.out.println(" descending order in salary ");
               System.out.println(z);});
            break;
         
         case 6: 
            l1.stream().map(x->x.salary+=(0.1*x.salary)).forEach(x->{});
            System.out.println("salaries updated \n"+l1);
            break;
         
         // case 7:
         //    l1.stream().forEach(x-> {
         //       int count= 0;
         //       for(Employee ){

         //       }
         //    });
         //    break;

         // case 8:
         //    l1.stream().reduce((x,y)->x.salary+y.salary).get();
         //    break;

         case 8:
            l1.stream().forEach(x->System.out.println(" "+x.name));
            break;

         case 9:
            System.out.println(" enter salary you want search more than ");
            int number2 = scanner.nextInt();
            l1.stream().forEach(x-> {
               if(x.salary > number2)
                  System.out.println(x);
            });
            break;

         case 10:
            l1.stream().map(x->(x.name).toUpperCase()).forEach(y->System.out.println(y));
            break;
         
         default:
            System.out.println(" only enter within 1 to 10 ");
      }

   }
}

class Employee{
   int salary, id;
   String name;

   Employee(int id, int salary, String name){
      this.name = name;
      this.id = id;
      this.salary = salary;
   }

   @Override
   public String toString(){
    return " name: "+name+"\n salary: "+salary+"\n id: "+id;
   }

}