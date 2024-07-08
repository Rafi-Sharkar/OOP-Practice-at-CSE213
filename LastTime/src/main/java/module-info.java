module rs.lasttime {
    requires javafx.controls;
    requires javafx.fxml;


    opens rs.lasttime to javafx.fxml;
    exports rs.lasttime;
}