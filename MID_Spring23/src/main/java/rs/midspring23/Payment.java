package rs.midspring23;

public class Payment {
    private String productName;
    private  double unitPrice;
    private int quantity;
    private double predefinedVat;
    private double vatAmount;
    private double totalAmount;

    public Payment(String productName, double unitPrice, int quantity, double predefinedVat, double vatAmount, double totalAmount) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.predefinedVat = predefinedVat;
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

    public double getPredefinedVat() {
        return predefinedVat;
    }

    public void setPredefinedVat(double predefinedVat) {
        this.predefinedVat = predefinedVat;
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
        return "Payment{" +
                "productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", predefinedVat=" + predefinedVat +
                ", vatAmount=" + vatAmount +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
