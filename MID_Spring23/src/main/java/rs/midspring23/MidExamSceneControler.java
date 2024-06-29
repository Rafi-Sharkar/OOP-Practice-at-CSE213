package rs.midspring23;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.StringReader;

public class MidExamSceneControler
{
    @javafx.fxml.FXML
    private TableView tableTV;
    @javafx.fxml.FXML
    private TableColumn<Payment, SimpleDoubleProperty> unitpriceTV;
    @javafx.fxml.FXML
    private TableColumn<Payment, SimpleDoubleProperty> vatTV;
    @javafx.fxml.FXML
    private ComboBox<Integer> quantityCB;
    @javafx.fxml.FXML
    private TableColumn<Payment, SimpleDoubleProperty> vatamountTV;
    @javafx.fxml.FXML
    private ComboBox<String> productnameCB;
    @javafx.fxml.FXML
    private TableColumn<Payment, SimpleIntegerProperty> quantityTV;
    @javafx.fxml.FXML
    private TextField maxperunitproductcostTF;
    @javafx.fxml.FXML
    private ComboBox<Double> vatconsiderCB;
    @javafx.fxml.FXML
    private Label text_LB;
    @javafx.fxml.FXML
    private Label predefinedvatLB;
    @javafx.fxml.FXML
    private CheckBox usdCheckBox;
    @javafx.fxml.FXML
    private RadioButton cardRB;
    @javafx.fxml.FXML
    private Label unitpriceLB;
    @javafx.fxml.FXML
    private TableColumn<Payment, SimpleDoubleProperty> totalamountTV;
    @javafx.fxml.FXML
    private TableColumn<Payment, SimpleStringProperty> productTV;
    @javafx.fxml.FXML
    private RadioButton cashRB;

    private ObservableList<Payment> set = FXCollections.observableArrayList();
    private ToggleGroup toggle;
    @javafx.fxml.FXML
    private TextArea totalpayableTA;
    @javafx.fxml.FXML
    private TextArea paymentstatusTA;

    @javafx.fxml.FXML
    public void initialize() {
//        set ComboBox's option
        productnameCB.getItems().addAll("Banana", "Mango", "Apple", "Burger","Rice", "Drinko","Soap", "Milk", "Tea", "Fish" );
        quantityCB.getItems().addAll(1,2,3,4,5,6,7,8,9,10);
        vatconsiderCB.getItems().addAll(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0,13.0,14.0,15.0);

//        set default value in combo box
        productnameCB.setValue("Select Product");
        quantityCB.setValue(0);

//     Initialize Table Column
productTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleStringProperty>("productName"));
unitpriceTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleDoubleProperty>("unitPrice"));
quantityTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleIntegerProperty>("quantity"));
vatTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleDoubleProperty>("predefinedVat"));
vatamountTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleDoubleProperty>("vatAmount"));
totalamountTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleDoubleProperty>("totalAmount"));

//      radio button
        toggle = new ToggleGroup();
        cardRB.setToggleGroup(toggle);
        cashRB.setToggleGroup(toggle);
    }

    @Deprecated
    public void showAlert(String title, String content){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
//      calculate vat amount
    private double vatAmount(double unit, double pdv, int qtt){
        double t_vat, t_amount;
        t_amount = unit*qtt;
        t_vat = t_amount*pdv/100;
        return t_vat;
    }
//      create total amount
    private double totalAmount(double unit, double pdv, int qtt){
        double t_vat, t_amount;
        t_amount = unit*qtt;
        t_vat = t_amount*pdv/100;
        return t_vat + t_amount;
    }
//    clear data from form
    private void clearData(){
        productnameCB.setValue("Select Product");
        quantityCB.setValue(0);
        unitpriceLB.setText("");
        predefinedvatLB.setText("");
    }

    @javafx.fxml.FXML
    public void AddProductCart(ActionEvent actionEvent) {
//        verification and validation
        String selected = productnameCB.getValue();
        int qtt = quantityCB.getValue();
        String sp = "Select Product";

        if (selected.equals(sp) && qtt==0 ){
            showAlert("Data isn't Selected", "Enter all data at combo box product name and quantity");
        }else {
            String name = productnameCB.getValue();
            Double unit = Double.valueOf(unitpriceLB.getText());
            Integer quantity = Integer.valueOf(quantityCB.getValue());
            Double pdvat = Double.valueOf(predefinedvatLB.getText());

            Payment p = new Payment(name, unit, quantity, pdvat, vatAmount(unit,pdvat,quantity),totalAmount(unit, pdvat, quantity));
            set.add(p);
            tableTV.getItems().add(p);
            clearData();

        }
    }

    @Deprecated
    public void CheckOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ShowTotalVatAmount(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void selectProductOnMouseClick(ActionEvent actionEvent) {
//        takes value from selected product comboBox and use as expression inside the switch keyword
        switch (productnameCB.getValue()){
            case  "Banana":
                unitpriceLB.setText("40");
                predefinedvatLB.setText("8");
                break;
            case "Mango":
                unitpriceLB.setText("10");
                predefinedvatLB.setText("7");
                break;
            case  "Apple":
                unitpriceLB.setText("250");
                predefinedvatLB.setText("10");
                break;
            case  "Burger":
                unitpriceLB.setText("240");
                predefinedvatLB.setText("20");
                break;
            case  "Rice":
                unitpriceLB.setText("70");
                predefinedvatLB.setText("1");
                break;
            case  "Drinko":
                unitpriceLB.setText("30");
                predefinedvatLB.setText("15");
                break;
            case  "Soap":
                unitpriceLB.setText("60");
                predefinedvatLB.setText("13");
                break;
            case  "Milk":
                unitpriceLB.setText("100");
                predefinedvatLB.setText("6");
                break;
            case  "Tea":
                unitpriceLB.setText("90");
                predefinedvatLB.setText("12");
                break;
            case  "Fish":
                unitpriceLB.setText("400");
                predefinedvatLB.setText("4");
                break;
            default:
                unitpriceLB.setText("");
                predefinedvatLB.setText("");
        }
    }

    @javafx.fxml.FXML
    public void itemDelete(ActionEvent actionEvent) {
        if (tableTV.getSelectionModel().getSelectedItems().isEmpty()){
            showAlert("No data is selected at table", "Plaease select any row from table");
        }else {
            ObservableList<Payment> selectedRows, addALlproduct;
            addALlproduct = tableTV.getItems();
            selectedRows = tableTV.getSelectionModel().getSelectedItems();

            addALlproduct.removeAll(selectedRows);

        }
    }

    @javafx.fxml.FXML
    public void checkOut(ActionEvent actionEvent) {
        paymentstatusTA.setText("");
        totalpayableTA.clear();
        if ( !cashRB.isSelected() && !cardRB.isSelected()){
            showAlert("No Payment Method selected", "Select any payment cash or card");
        }else {
            if (cashRB.isSelected()){
                paymentstatusTA.setText("Paid by Cash");
            } else if (cardRB.isSelected()) {
                paymentstatusTA.setText("Paid by Card");
            }
        }
        if (!set.isEmpty()){
            Double tpa = 0.0;
//           store all row's data from table
            ObservableList<Payment> temp_set = tableTV.getItems();
            for (Payment pm: temp_set){
                tpa += pm.getTotalAmount();
            }
//            is usd or bdt
            if (usdCheckBox.isSelected()){
                double tpa_usd;
                tpa_usd = tpa/110;
                String ds = Double.toString(tpa_usd).substring(0, Double.toString(tpa_usd).indexOf('.')+4);
                totalpayableTA.appendText(ds + "USD");
            }else {
                totalpayableTA.appendText(Double.toString(tpa)+ "TK");
            }
        }else {
            if (usdCheckBox.isSelected()){
                totalpayableTA.setText("00 tk");
            }else {
                totalpayableTA.setText("00 USD");
            }
        }
    }
}