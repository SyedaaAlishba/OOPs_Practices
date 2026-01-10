package Program;

import Car.*;

public class Program {
    public void run(){

     Owner owner1 = new Owner("Alishba");
     Car myCar= new Car("kia","suv","white",owner1);

     Car shallowCar=new Car(myCar);
     Car deepCar=new Car(myCar,true);
     owner1.name="changedName";
     System.out.println("Original Car:");
     System.out.println(myCar);
     System.out.println("Shallow Copied Car:");
     System.out.println(shallowCar);
     System.out.println("Deep Copied Car:");
     System.out.println(deepCar);
    }
}
