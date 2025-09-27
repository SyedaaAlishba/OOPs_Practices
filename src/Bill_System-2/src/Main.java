import people.Customer;
import shop.Cashier;
import shop.Product;

public class Main {
    public static void main(String[] args){

        //Products in Shop
        Product Bread= new Product("Bread",250,20);
        Product Egg = new Product("Egg",120,30);
        Product Butter= new Product("Peanut Butter",925,5);
        Product Nutella = new Product("Nutella",1000,5);
        Product milk= new Product("Milk Pack",350,100);
        Product Biscuit= new Product("Cafe",40,100);

        //Cashier
        Cashier Uncle= new Cashier("Uncle");
        Uncle.getWallet().put(1000,3);
        Uncle.getWallet().put(500,2);
        Uncle.getWallet().put(100,6);
        Uncle.getWallet().put(20,10);
        Uncle.getWallet().put(10,10);
        Uncle.getWallet().put(5,10);
        Uncle.getWallet().put(2,10);


        //Customer
        Customer Bacha = new Customer("Chintu");
        Bacha.getWallet().put(100,1);
        Bacha.getWallet().put(50,2);
        Bacha.getWallet().put(5000,1);

        Bacha.myWallet();
        Bacha.buyProduct();
        Bacha.viewBill(Uncle);
        Bacha.payBill(Uncle);


    }
}
