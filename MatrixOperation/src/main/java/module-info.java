module com.rs.mainpackge.matrixoperation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rs.mainpackge.matrixoperation to javafx.fxml;
    exports com.rs.mainpackge.matrixoperation;
}