package Q2;


 class Employee {
    public String name;
    private String address;
    private int Salary;
    public String job_title;

    Employee(String name, String address, int Salary, String job_title){
        this.name=name;
        this.address=address;
        this.Salary=Salary;
        this.job_title= job_title;
    }

    public String getAddress(){
        return address;
    }

    public int getSalary(){
        return Salary;
    }

    public double  calculating_Bonus(){
    return 0;
    }
     public String  generating_performance_reports(){
        return "No performance report available";
     }
    public String  managing_projects(){
     return "No project";
    }

}
