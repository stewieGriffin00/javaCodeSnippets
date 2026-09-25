import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class Main{
   public static void main(String[] args){
      ArrayList<String> hrSkills =  new ArrayList<String>();
      ArrayList<String> javaDeveloperSkills = new ArrayList<String>();
      ArrayList<String> pythonDeveloperSkills = new ArrayList<String>();

      hrSkills.add("Communication ");
      hrSkills.add("English speaking ");
      hrSkills.add("Ms Word");

      javaDeveloperSkills.add("javascript");
      javaDeveloperSkills.add("java");
      javaDeveloperSkills.add("mysql");

      pythonDeveloperSkills.add("javascript");
      pythonDeveloperSkills.add("python");
      pythonDeveloperSkills.add("postgresql");

      JobDetails developer = new JobDetails("HR", 50_000, hrSkills);
      JobDetails javaDeveloper = new JobDetails("Java Developer", 30_000, javaDeveloperSkills);
      JobDetails pythonDeveloper = new JobDetails("python Developer", 25_000, pythonDeveloperSkills);
      ArrayList<JobDetails> jobs = new ArrayList<JobDetails>();
      jobs.add(developer);
      jobs.add(javaDeveloper);
      jobs.add(pythonDeveloper);

      Comparator<JobDetails> c1  = (JobDetails j1, JobDetails j2)->{
         return j2.salary - j1.salary;
      };

      Collections.sort(jobs,c1);
      for(JobDetails j : jobs){
         System.out.println(" name: "+j.job+" salary: "+j.salary);
      }
   }
}

class JobDetails{
   String job;
   int salary;
   ArrayList<String> skillList;

   JobDetails(String job, int salary, ArrayList<String> skillList){
      this.job = job;
      this.salary = salary;
      this.skillList  = skillList;
   }
}