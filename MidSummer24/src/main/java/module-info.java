module rs.midsummer24 {
    requires javafx.controls;
    requires javafx.fxml;


    opens rs.midsummer24 to javafx.fxml;
    exports rs.midsummer24;
}