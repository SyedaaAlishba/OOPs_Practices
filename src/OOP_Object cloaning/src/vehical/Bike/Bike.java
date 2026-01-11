package vehical.Bike;
import  vehical.Vehical;

public class Bike extends Vehical{
    public  Bike (String name, String model, String company, String color){
        this.name =name;
        this.color= color;
        this.model=model;
        this.company=company;
    }


    public Bike(Bike other){
        this.name =other.name;
        this.color= other.color;
        this.model=other.model;
        this.company=other.company;
    }

    public void print(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(model);
        System.out.println(company);

    }



}
