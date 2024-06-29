module rs.midspring23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens rs.midspring23 to javafx.fxml;
    exports rs.midspring23;
}