package Entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(){
    }

    public OrderItem(Integer quantity, Double price, Product product){
        super();
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void SetQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public void SetProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        return this.quantity * this.price;
    }
    @Override
    public String toString() {
        return getProduct().getName() 
        + ", $" 
        + String.format("%.2f", price) 
        + ", Quantity: "
        + quantity
        + ", SubTotal: $"
        + String.format("%.2f", subTotal());
    }
}