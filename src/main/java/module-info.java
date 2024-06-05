module rs.practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens rs.practice to javafx.fxml;
    exports rs.practice;
}