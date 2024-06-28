package rs.mid_autumn23;


import javafx.beans.property.Property;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ItemViewController{
    @javafx.fxml.FXML
    private TableColumn<Product, String> materialTV;
    @javafx.fxml.FXML
    private ComboBox<String> materialCB;
    @javafx.fxml.FXML
    private TextField productnameTF;
    @javafx.fxml.FXML
    private TableColumn<Product, String> productnameTV;
    @javafx.fxml.FXML
    private ComboBox<Integer> quantityCB;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TextField productidTF;
    @javafx.fxml.FXML
    private TableColumn<Product, Integer> idTV;
    @javafx.fxml.FXML
    private TableColumn<Product, Integer> quantityTV;
    @javafx.fxml.FXML
    private TableView fulltableTV;

    @javafx.fxml.FXML
    public void initialize() {
        materialCB.getItems().addAll("Wood","Metal", "Board", "Cloth");
        quantityCB.getItems().addAll(1,2,3,4,5);
        quantityTV.setCellValueFactory(new PropertyValueFactory<Product, Integer>("quantity"));
        productnameTV.setCellValueFactory(new PropertyValueFactory<Product, String>("product_name"));
        materialTV.setCellValueFactory(new PropertyValueFactory<Product, String>("material"));
        idTV.setCellValueFactory(new PropertyValueFactory<Product, Integer>("product_id"));
    }


    @javafx.fxml.FXML
    public void onAction(ActionEvent actionEvent) {
        String product_name = productidTF.getText();
        int product_id = Integer.parseInt(productidTF.getText());
        String material = materialCB.getValue();
        int quantity = quantityCB.getValue();
        LocalDate delivery_date =  dateDP.getValue();
        Product pdata = new Product(product_name,material, product_id, quantity, delivery_date);

        fulltableTV.getItems().add(pdata);

    }
}