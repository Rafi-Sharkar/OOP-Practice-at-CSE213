package rs.supershop;

public class Product {
    private String productName;
    private double unitPrice;
    private int quantity;
    private double preVat;
    private double vatAmount;
    private double totalAmount;

    public Product(String productName, double unitPrice, int quantity, double preVat, double vatAmount, double totalAmount) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.preVat = preVat;
        this.vatAmount = vatAmount;
        this.totalAmount = totalAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPreVat() {
        return preVat;
    }

    public void setPreVat(double preVat) {
        this.preVat = preVat;
    }

    public double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", preVat=" + preVat +
                ", vatAmount=" + vatAmount +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
