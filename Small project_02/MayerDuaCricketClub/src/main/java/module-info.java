module com.rs.mainpackge.mayerduacricketclub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rs.mainpackge.mayerduacricketclub to javafx.fxml;
    exports com.rs.mainpackge.mayerduacricketclub;
}