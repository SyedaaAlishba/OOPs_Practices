package Q2;

public class Programmer extends  Employee{
    private final String programming_lang;
   public Programmer(String name, String address, int Salary, String job_title, String programming_lang){
        super(name, address, Salary,job_title);
        this.programming_lang=programming_lang;
    }

    public String getProgramming_lang(){
        return programming_lang;
    }

    @Override
    public  double calculating_Bonus() {
        return getSalary()*0.5;
    }


    @Override
    public String generating_performance_reports(){
        return "Generating performance reports by "+name;
    }

    @Override
    public String  managing_projects(){
        return super.managing_projects();
    }
    public void writeCode() {
        // Printing a message indicating the developer is writing code
        System.out.println("Programmer " + name+ " is writing code in " + programming_lang);
    }
    public void debug(){
        System.out.println("Programmer "+name+" is debugging code in "+programming_lang);
    }
}
