package Car;

public class Car {
    String carName;
    String carType;
    String carColor;
    Owner owner;

    public Car(String name, String type, String color,Owner owner){
        carName=name;
        carColor=color;
        carType=type;
        this.owner=owner;
    }
    // shallow copy constructor
    public Car(Car other){
        carName= other.carName;
        carType=other.carType;
        carColor=other.carColor;
        this.owner = other.owner;
    }
    //deep copy constructor
    public Car(Car other, boolean deepCopy){
        this.carName = other.carName;
        this.carType = other.carType;
        this.carColor = other.carColor;
        if (deepCopy) {
            this.owner = new Owner(other.owner);
        }
    }
    @Override
    public String toString() {
        return "Car Name: " + carName + ", Type: " + carType + ", Color: " + carColor + ", Owner: " + owner.name;
    }

}
