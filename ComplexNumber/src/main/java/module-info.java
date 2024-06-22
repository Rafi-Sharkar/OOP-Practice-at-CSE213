module com.rs.mainpackge.complexnumber {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rs.mainpackge.complexnumber to javafx.fxml;
    exports com.rs.mainpackge.complexnumber;
}