package rs.mid_autumn23;

import java.time.LocalDate;

public class Product {
    String product_name, material;
    int product_id, quantity;
    LocalDate date;

    public Product(String product_name, String material, int product_id, int quantity, LocalDate date) {
        this.product_name = product_name;
        this.material = material;
        this.product_id = product_id;
        this.quantity = quantity;
        this.date = date;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
