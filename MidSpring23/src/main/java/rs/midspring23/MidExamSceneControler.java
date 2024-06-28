package rs.midspring23;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class MidExamSceneControler
{
    @javafx.fxml.FXML
    private TableView tableTV;
    @javafx.fxml.FXML
    private Label paidstatusLB;
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
    private Label totalpayableLB;
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

    @javafx.fxml.FXML
    public void initialize() {
//        set ComboBox's option
        productnameCB.getItems().addAll("Banana", "Mango", "Apple", "Burger","Rice", "Fruit" );
        quantityCB.getItems().addAll(1,2,3,4,5,6,7,8,9,10);
        vatconsiderCB.getItems().addAll(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0,13.0,14.0,15.0);

//        set default value in combo box
        productnameCB.setValue("Select Product");

//     Initialize Table Column
productTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleStringProperty>("productName"));
unitpriceTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleDoubleProperty>("unitPrice"));
quantityTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleIntegerProperty>("quantity"));
vatTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleDoubleProperty>("predefinedVat"));
vatamountTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleDoubleProperty>("vatAmount"));
totalamountTV.setCellValueFactory(new PropertyValueFactory<Payment, SimpleDoubleProperty>("totalAmount"));

    }

    @javafx.fxml.FXML
    public void addOnClickMouse(){
//        Varification and validation
        String selected = productnameCB.getValue();
        String sp = "Select Product";
        if(selected.equals(sp)){
            showAlert("No product Selected"," Please select a product from the product list");
        }else {
            Integer selectvalue = quantityCB.getValue();
            Payment n = new Payment(productnameCB.getValue(), unitpriceLB,quantityCB, predefinedvatLB, 1.0,20);
        }

    }

    @javafx.fxml.FXML
    public void showAlert(String title, String content){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void AddProductCart(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CheckOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ShowTotalVatAmount(ActionEvent actionEvent) {
    }
}