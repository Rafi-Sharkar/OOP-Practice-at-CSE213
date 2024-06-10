module com.rs.mainpackge.course_manager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rs.mainpackge.course_manager to javafx.fxml;
    exports com.rs.mainpackge.course_manager;
}