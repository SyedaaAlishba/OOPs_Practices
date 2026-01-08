public class Cow implements Animal,HERBIVORE{
    public void walk(){
        System.out.println("Cow is walking");
    }
    public void eat() {
        System.out.println("cow is eating");
    }

    public void print(){
        walk();
        eat();
    }
}
