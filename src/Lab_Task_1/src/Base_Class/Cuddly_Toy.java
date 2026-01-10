package Base_Class;

public abstract class Cuddly_Toy {
    protected String size;
    protected String job;
    protected String colour;
    protected String noise;
    protected String toyType;


    public Cuddly_Toy(String size, String colour,String toyType){
        this.size = size;
        this.colour = colour;
        this.toyType=toyType;
    }

    public String getToyType() {
        return toyType;
    }

    public String getSize() {
        return size;
    }
    public String getJob(){
       return job;
    }
    public String getColour() {
       return colour;
    }
    public String getNoise(){
       return noise;
    }
    public void describe(){
        System.out.println("Toy Type : "+getToyType());
        System.out.println("Job      : "+getJob());
        System.out.println("Size     : "+getSize());
        System.out.println("Colour   : "+getColour());

    }
   public abstract void makeNoise();


}
