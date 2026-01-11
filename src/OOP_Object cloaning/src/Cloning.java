import vehical.Bike.Bike;
public class Cloning{
    public static void main(String[] args) {

        Bike original_bike=new Bike("myHeavyCar","2026","Honda","Black");
        original_bike.print();
        Bike modified_bike= new Bike(original_bike);
        System.out.println("Clone (another bike)");
        modified_bike.print();

        System.out.println("\nmodifying \n");
        modified_bike.name="My Black Monster ";
        modified_bike.company="Suzuki";
        modified_bike.print();

    }
}