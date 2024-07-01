module rs.supershop {
    requires javafx.controls;
    requires javafx.fxml;


    opens rs.supershop to javafx.fxml;
    exports rs.supershop;
}