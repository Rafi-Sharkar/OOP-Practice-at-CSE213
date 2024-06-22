package com.rs.mainpackge.course_manager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class CourseManagerController
{
    @javafx.fxml.FXML
    private RadioButton foundationRadioButton;
    @javafx.fxml.FXML
    private RadioButton minorRadioButton;
    @javafx.fxml.FXML
    private TextField capacityTextField;
    @javafx.fxml.FXML
    private ComboBox<String> labCodeComboBox;
    @javafx.fxml.FXML
    private TextArea labTextArea;
    @javafx.fxml.FXML
    private Label courseNavLabel;
    @javafx.fxml.FXML
    private CheckBox isLabCheckBox;
    @javafx.fxml.FXML
    private ComboBox<String> labTimeComboBox;
    @javafx.fxml.FXML
    private TextArea courseTextArea;
    @javafx.fxml.FXML
    private TextField courseNameTextField;
    @javafx.fxml.FXML
    private RadioButton majorRadioButton;
    @javafx.fxml.FXML
    private ComboBox<String> courseCodeComboBox;
    @javafx.fxml.FXML
    private DatePicker courseStartDatePicker;
    @javafx.fxml.FXML
    private RadioButton coreRadioButton;
    @javafx.fxml.FXML
    private TextField courseSectionTextField;
    @javafx.fxml.FXML
    private TextField facultyNameTextField;
    @javafx.fxml.FXML
    private Button addtoTextAreaBtn;
    @javafx.fxml.FXML
    private ComboBox<String> courseTimeComboBox;

    private ToggleGroup toggle;
    private ArrayList<Course> courseDetail;

    @javafx.fxml.FXML
    public void initialize() {
        courseCodeComboBox.getItems().addAll("PHY101", "ENG101", "CSE101", "CSE203","CSE213","CSE316", "MAT212", "MAT301", "MAT104");

        courseTimeComboBox.getItems().addAll("ST:0800-0930", "ST:0940-1110", "ST:1120-1250", "ST:1300-1420", "ST:1440-1610", "ST:1820-1950");

        labCodeComboBox.getItems().addAll("PHY101L",  "CSE101L", "CSE203L","CSE213L","CSE316L");

        labTimeComboBox.getItems().addAll("ST:0800-0930", "ST:0940-1110", "ST:1120-1250", "ST:1300-1420", "ST:1440-1610");

        toggle = new ToggleGroup();
        foundationRadioButton.setToggleGroup(toggle);
        minorRadioButton.setToggleGroup(toggle);
        majorRadioButton.setToggleGroup(toggle);
        coreRadioButton.setToggleGroup(toggle);

        courseDetail = new ArrayList<Course>();
        }


    @javafx.fxml.FXML
    public void viewCourseInfoButtonOnClick(ActionEvent actionEvent) {
        String courseType;
        if (toggle.getSelectedToggle() == null){
            courseType = "Not Declared";
        }else if (toggle.getSelectedToggle().equals(foundationRadioButton)) {
            courseType = "Foundation";
        } else if (toggle.getSelectedToggle().equals(coreRadioButton)) {
            courseType = "Core";
        }else if (toggle.getSelectedToggle().equals(majorRadioButton)){
            courseType = "Major";
        }else {
            courseType = "Minor";
        }
        Course new_course = new Course(courseType, courseNameTextField.getText(), courseCodeComboBox.getValue(), courseTimeComboBox.getValue(), Integer.parseInt(courseSectionTextField.getText()), labCodeComboBox.getValue(), labTimeComboBox.getValue().toString(), facultyNameTextField.getText(), Integer.parseInt(capacityTextField.getText()));

        courseDetail.add(new_course);

        String final_output = "";
        for (Course each_Course : courseDetail){
            final_output += (each_Course.toString()+"\n");
        }
        courseTextArea.setText(final_output);

    }
}