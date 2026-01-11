package my_Animal;

import Mammal.Mammal;

public class Cat extends Mammal {
    public Cat(String name){
        super(name);
       this.name="Cat";
        System.out.println("I'm Cat my name is "+name);
    }

    @Override
    public void makeNoise() {
        this.noise="meow meow";
        System.out.println(this.name+" says "+this.noise);
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
