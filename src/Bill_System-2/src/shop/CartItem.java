package shop;

public class CartItem {
    private Product product;
    private int purchasedQuantity;

    public CartItem(Product product, int purchasedQuantity) {
        this.product = product;
        this.purchasedQuantity = purchasedQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public int getTotalPrice() {
        return product.getPrice() * purchasedQuantity;
    }
}
