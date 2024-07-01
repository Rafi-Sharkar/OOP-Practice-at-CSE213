package rs.supershop;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class SuperShopControler
{
    @javafx.fxml.FXML
    private TableView tableTV;
    @javafx.fxml.FXML
    private TableColumn<Product, Double> unitpriceTV;
    @javafx.fxml.FXML
    private TextArea prevatTA;
    @javafx.fxml.FXML
    private TableColumn<Product, Double> tatalamountTV;
    @javafx.fxml.FXML
    private ComboBox<String> selectproductCB;
    @javafx.fxml.FXML
    private TableColumn<Product, Double> vatTV;
    @javafx.fxml.FXML
    private TextArea showmeetconditionTA;
    @javafx.fxml.FXML
    private ComboBox<Integer> quantityCB;
    @javafx.fxml.FXML
    private TableColumn<Product, Double> vatamountTV;
    @javafx.fxml.FXML
    private TableColumn<Product, Integer> quantityTV;
    @javafx.fxml.FXML
    private TextField maxunitcostTF;
    @javafx.fxml.FXML
    private TextArea paystatusTA;
    @javafx.fxml.FXML
    private TextArea unitpriceTA;
    @javafx.fxml.FXML
    private ComboBox<Double> vatconsiderCB;
    @javafx.fxml.FXML
    private TextArea tatalpaybillTA;
    @javafx.fxml.FXML
    private RadioButton cardRB;
    @javafx.fxml.FXML
    private RadioButton cashRB;
    @javafx.fxml.FXML
    private TableColumn<Product, String> productTV;

    private ObservableList<Product> set = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private CheckBox usdCheckBox;

    @javafx.fxml.FXML
    public void initialize() {
        selectproductCB.getItems().addAll("A", "B", "C", "D", "E");
        quantityCB.getItems().addAll(1,2,3,4,5,6,7,8,9,10);
        vatconsiderCB.getItems().addAll(1.,2.,3.,4.,5.,6.,7.,8.,9.,10.);

        productTV.setCellValueFactory(new PropertyValueFactory<Product, String>("productName"));
        unitpriceTV.setCellValueFactory(new PropertyValueFactory<Product, Double>("unitPrice"));
        quantityTV.setCellValueFactory(new PropertyValueFactory<Product, Integer>("quantity"));
        vatTV.setCellValueFactory(new PropertyValueFactory<Product, Double>("preVat"));
        vatamountTV.setCellValueFactory(new PropertyValueFactory<Product, Double>("vatAmount"));
        tatalamountTV.setCellValueFactory(new PropertyValueFactory<Product, Double>("totalAmount"));

        ToggleGroup toggle = new ToggleGroup();
        cashRB.setToggleGroup(toggle);
        cardRB.setToggleGroup(toggle);

        selectproductCB.setValue("Select Product");
        quantityCB.setValue(0);
    }

    @javafx.fxml.FXML
    public void showTotalVatAmountMeetingCondition(ActionEvent actionEvent) {
        if ( maxunitcostTF.getText().equals("") && vatconsiderCB.getValue() == null){
            showAlert("Max unit rate and vat consider are not entered", "Plase select both");
        }else {
            showmeetconditionTA.clear();
            double tcvat = 0.0;
            for (Product p: set){
                if (p.getUnitPrice()>= Double.valueOf(maxunitcostTF.getText())){
                    tcvat += p.getVatAmount();
                }else {
                    tcvat += 0.0;
                }
            }
            double discount = tcvat*vatconsiderCB.getValue()/100.0;
            showmeetconditionTA.appendText("Discount amount"+discount);
        }
    }

    @javafx.fxml.FXML
    public void productDelete(ActionEvent actionEvent) {
        if (tableTV.getSelectionModel().getSelectedItems().isEmpty()){
            showAlert("Data or row is not selected", "Place select any row to delete");
        }else {
            ObservableList<Product> selectedProduct, allProduct;
            allProduct = tableTV.getItems();
            selectedProduct = tableTV.getSelectionModel().getSelectedItems();
            allProduct.removeAll(selectedProduct);
        }
    }

    @javafx.fxml.FXML
    public void checkOut(ActionEvent actionEvent) {
            paystatusTA.setText("");
            tatalpaybillTA.clear();
            if (!cardRB.isSelected() && !cashRB.isSelected()){
                showAlert("You are not select paymert method","Please, Select any Payment method to pay");
            }else {
                if (cardRB.isSelected()){
                    paystatusTA.setText("paid by Card");
                }else {
                    paystatusTA.setText("paid by Cash");
                }
                if (!set.isEmpty()){
                    double tpa = 0.0;
                    ObservableList<Product> selectAllItem = tableTV.getItems();
                    for ( Product p : selectAllItem) {
                        tpa += p.getTotalAmount();
                    }
                if (usdCheckBox.isSelected()){
                    double usd = tpa/117;
                    String ds = Double.toString(usd).substring(0,Double.toString(usd).indexOf('.')+3);
                    tatalpaybillTA.setText(ds+"USD");
                }else {
                    tatalpaybillTA.setText(Double.toString(tpa)+"BDT");
                }
                }else {
                    if(usdCheckBox.isSelected()){
                        tatalpaybillTA.setText("00 USD");
                    }else {
                        tatalpaybillTA.setText("00 BDT");
                    }
                }
            }
    }

    private  double vatAmount(int qtt, double unit, double vat){
        double total;
        total = qtt*unit;
        return total*vat/100.0;
    }
    private  double totalAmount(int qtt, double unit, double vat){
        double total;
        total = qtt*unit;
        return (total*vat/100.0)+total;
    }

    @javafx.fxml.FXML
    public void addtoCart(ActionEvent actionEvent) {
        String pn = selectproductCB.getValue();
        int qtt = quantityCB.getValue();
        if (pn.equals("Select Product") && (qtt==0)){
            showAlert("Select product and quantity","Please, Select any product and quantity from");
        }else {
            String productname = selectproductCB.getValue();
            int quantity = quantityCB.getValue();
            double prevat = Double.valueOf(prevatTA.getText());
            double unit = Double.valueOf(unitpriceTA.getText());
            double vatA = vatAmount(quantity, unit, prevat);
            double totalA = totalAmount(quantity, unit, prevat);

            Product p = new Product(productname, unit, quantity, prevat, vatA, totalA);
            set.add(p);
            tableTV.getItems().add(p);
            clearData();
        }
    }

    private void clearData(){
        selectproductCB.setValue("Select Product");
        unitpriceTA.setText("");
        prevatTA.setText("");
        quantityCB.setValue(0);
    }

    private  void showAlert(String title, String discription){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(discription);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void selectProduct(ActionEvent actionEvent) {
        switch (selectproductCB.getValue()){
            case "A":
                unitpriceTA.setText("30");
                prevatTA.setText("4");
                break;
            case "B":
                unitpriceTA.setText("70");
                prevatTA.setText("14");
                break;
            case "C":
                unitpriceTA.setText("20");
                prevatTA.setText("8");
                break;
            case "D":
                unitpriceTA.setText("60");
                prevatTA.setText("5");
                break;
            case "E":
                unitpriceTA.setText("80");
                prevatTA.setText("3");
                break;
            default:
                unitpriceTA.setText("");
                prevatTA.setText("");

        }
    }
}