package rs.studentprofile;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class StudentProfileControler
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private RadioButton maleRB;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    @javafx.fxml.FXML
    private RadioButton femaleRB;
    @javafx.fxml.FXML
    private ComboBox<String> nationalityCB;
    @javafx.fxml.FXML
    private TextField idTF;

//    private ArrayList<Student>  students1 = new ArrayList<>();

    private ObservableList<Student> students1 = FXCollections.observableArrayList();;

    @javafx.fxml.FXML
    private TextArea showTA;

//    private ToggleGroup toggle;

    @javafx.fxml.FXML
    public void initialize() {
        nationalityCB.getItems().addAll("Bangladeshi", "Indian", "Pakistani", "Amarican", "Europan");

        ToggleGroup toggle = new ToggleGroup();
        maleRB.setToggleGroup(toggle);
        femaleRB.setToggleGroup(toggle);

    }

    @javafx.fxml.FXML
    public void addStudentProfile(ActionEvent actionEvent) {
        String name = nameTF.getText();
        String id = idTF.getText();
        String dob = String.valueOf(dobDP.getValue());
        String nty = nationalityCB.getValue();
        String gender = "";
        if (maleRB.isSelected()){
            gender = "Male";
        } else if (femaleRB.isSelected()) {
            gender = "Female";
        }
        Student stu = new Student(name,id, gender, dob, nty);
        students1.add(stu);

        showTA.setText(students1.toString());
    }
}