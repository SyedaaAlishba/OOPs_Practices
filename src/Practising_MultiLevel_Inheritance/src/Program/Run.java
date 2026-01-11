package Program;

import my_Animal.Cat;
import my_Animal.Dog;

public class Run {
    public void run(){
        Dog zorro =new Dog("Zorro");
        zorro.makeNoise();
        zorro.eat();
        zorro.walk();

        Cat cio=new Cat("Cio");
        cio.makeNoise();
        cio.eat();
        cio.walk();


    }
}
