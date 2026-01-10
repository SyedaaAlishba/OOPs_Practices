package Car;

public class Owner {
    public String name;

    public Owner(String name) {
        this.name = name;
    }

    // Copy constructor for deep copy
    public Owner(Owner other) {
        this.name = other.name;
    }
}
