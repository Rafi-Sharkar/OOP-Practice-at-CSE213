module rs.studentprofile {
    requires javafx.controls;
    requires javafx.fxml;


    opens rs.studentprofile to javafx.fxml;
    exports rs.studentprofile;
}