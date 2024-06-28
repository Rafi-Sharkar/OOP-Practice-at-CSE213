module rs.mid_autumn23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens rs.mid_autumn23 to javafx.fxml;
    exports rs.mid_autumn23;
}