package Animal;

public abstract class Animal {
    public String name;
    public  String noise;

  public Animal(String name){
      this.name=name;
  }
  public abstract void walk();
  public abstract void makeNoise();
  public void eat(){
      System.out.println("Animal "+name+" Can eat");
  }


}
