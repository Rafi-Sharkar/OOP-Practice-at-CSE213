module com.rs.mainpackge.mid_summer_23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rs.mainpackge.mid_summer_23 to javafx.fxml;
    exports com.rs.mainpackge.mid_summer_23;
}