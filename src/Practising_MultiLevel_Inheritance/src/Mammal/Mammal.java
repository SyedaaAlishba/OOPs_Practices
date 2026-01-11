package Mammal;
import Animal.*;

public class Mammal extends Animal {
   public Mammal(String name){
       super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println( name+ " makes noises");
    }

    @Override
    public void walk() {
        System.out.println(name +" can walk");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
