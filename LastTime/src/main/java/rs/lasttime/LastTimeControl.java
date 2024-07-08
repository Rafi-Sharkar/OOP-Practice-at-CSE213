package rs.lasttime;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class LastTimeControl
{
    @javafx.fxml.FXML
    private TableView tableTV;
    @javafx.fxml.FXML
    private TableColumn<Product, Double> unitpriceTV;
    @javafx.fxml.FXML
    private TextArea prevatTA;
    @javafx.fxml.FXML
    private ComboBox selectproductCB;
    @javafx.fxml.FXML
    private TableColumn vatTV;
    @javafx.fxml.FXML
    private ComboBox quantityCB;
    @javafx.fxml.FXML
    private TableColumn vatamountTV;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn quantityTV;
    @javafx.fxml.FXML
    private TextArea unitpriceTA;
    @javafx.fxml.FXML
    private CheckBox usdCheckBox;
    @javafx.fxml.FXML
    private RadioButton cardRB;
    @javafx.fxml.FXML
    private TableColumn totalamountTV;
    @javafx.fxml.FXML
    private RadioButton cashRB;
    @javafx.fxml.FXML
    private TableColumn<Product, String> productTV;
    @javafx.fxml.FXML
    private ToggleGroup toggle;

    @javafx.fxml.FXML
    public void initialize() {
        productTV.setCellValueFactory(new PropertyValueFactory<Product, String>("productName"));
        unitpriceTV.setCellValueFactory(new PropertyValueFactory<Product, Double>("unitPrice"));
        vatTV.setCellValueFactory(new PropertyValueFactory<Product, Double>("preVat"));
        quantityTV.setCellValueFactory(new PropertyValueFactory<Product, Integer>("quantity"));

        quantityCB.setValue("S");
    }

    @javafx.fxml.FXML
    public void productDelete(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addtoCart(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void selectProduct(ActionEvent actionEvent) {
    }
}