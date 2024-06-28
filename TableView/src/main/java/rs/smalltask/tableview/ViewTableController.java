package rs.smalltask.tableview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;

public class ViewTableController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private DatePicker datePicker;

    @FXML
    private URL location;

    @FXML
    private TextField imgvalueTextField;

    @FXML
    private TextField realvalueTextField;

    @FXML
    private TableView<?> tvTableView;

    @FXML
    void addtoArrayList(ActionEvent event) {

    }

    @FXML
    void addtoTable(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert imgvalueTextField != null : "fx:id=\"imgvalueTextField\" was not injected: check your FXML file 'viewtable.fxml'.";
        assert realvalueTextField != null : "fx:id=\"realvalueTextField\" was not injected: check your FXML file 'viewtable.fxml'.";
        assert tvTableView != null : "fx:id=\"tvTableView\" was not injected: check your FXML file 'viewtable.fxml'.";

    }

}
