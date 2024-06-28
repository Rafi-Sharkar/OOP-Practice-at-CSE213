module rs.smalltask.tableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens rs.smalltask.tableview to javafx.fxml;
    exports rs.smalltask.tableview;
}