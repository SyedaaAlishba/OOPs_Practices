public class Goat  implements Animal,HERBIVORE {
  public void walk(){
    System.out.println("Goat is walking");
  }
  public void eat() {
    System.out.println("Goat is eating");
  }

  public void print(){
    walk();
    eat();
  }
}
