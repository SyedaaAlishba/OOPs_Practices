package my_Animal;

import Mammal.Mammal;

public class Dog extends Mammal {
    public Dog(String name){
        super(name);
        this.name=name;
        System.out.println("Im Dog my name is "+name);
    }

    @Override
    public void makeNoise() {
        this.noise="Wof WOf";
        System.out.println(this.name+" says "+this.noise);
    }

    @Override
    public void walk() {
        super.walk();
    }
}
