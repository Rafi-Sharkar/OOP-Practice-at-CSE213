package rs.midspring23;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.StringReader;

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

    private ToggleGroup toggle;


    @javafx.fxml.FXML
    public void initialize() {
//        set ComboBox's option
        productnameCB.getItems().addAll("Banana", "Mango", "Apple", "Burger","Rice", "Drinko","Soap", "Milk", "Tea", "Fish" );
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

    @javafx.fxml.FXML
    public void AddProductCart(ActionEvent actionEvent) {
//        verification and validation
        String selected = productnameCB.getValue();

    }

    @javafx.fxml.FXML
    public void CheckOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ShowTotalVatAmount(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void selectProductOnMouseClick(ActionEvent actionEvent) {
//        takes value from selected product comboBox and use as expression inside the switch keyword
        switch (productnameCB.getValue()){
//            "Banana", "Mango", "Apple", "Burger","Rice", "Drinko","Soap", "Milk", "Tea", "Fish"
            case  "Banana":
                unitpriceLB.setText("40");
                predefinedvatLB.setText("8");
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
}