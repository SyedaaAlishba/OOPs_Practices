package Q2;

public class Manager extends Employee{
    public Manager(String name, String address, int Salary, String job_title){
        super(name,address,Salary,job_title);
    }

   public double calculating_Bonus(){
        return getSalary()*0.15;
   }

   public String generating_performance_reports(){
        return "Performance report"+name+"Excellent";
   }


   public String managing_projects(){
        return "Managed project by "+name;
   }



}
