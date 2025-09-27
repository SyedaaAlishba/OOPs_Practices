package shop;
import customArray.objectArray;

public class Product {
    String name;
    int price;
    int stockQuantity;

    public static objectArray allProducts = new objectArray();

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = quantity;
        allProducts.add(this); //current object being created
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return stockQuantity;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + stockQuantity +
                '}';
    }

}