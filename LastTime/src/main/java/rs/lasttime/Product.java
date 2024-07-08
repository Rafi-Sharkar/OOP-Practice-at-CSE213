package rs.lasttime;

public class Product {
    private String  productName;
    private double unitPrice;
    private double preVat;
    private int quantity;

    public Product(String productName, double unitPrice, double preVat, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.preVat = preVat;
        this.quantity = quantity;
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

    public double getPreVat() {
        return preVat;
    }

    public void setPreVat(double preVat) {
        this.preVat = preVat;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private double vatAmount(double up, int qtt, double pv){
        double total ;
        total = up*qtt;
        return total*pv/100.0;
    }
    private double totalAmount(double up, int qtt, double pv){
        double total, vatA ;
        total = up*qtt;
        vatA = total*pv/100.0;
        return total+vatA;
    }
}

