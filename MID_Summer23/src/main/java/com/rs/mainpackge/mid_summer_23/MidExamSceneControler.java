package com.rs.mainpackge.mid_summer_23;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class MidExamSceneControler {

    @javafx.fxml.FXML
    private ComboBox<String> courseComboBox;

    @javafx.fxml.FXML
    private TextField creditsTextField;

    @javafx.fxml.FXML
    private CheckBox hasscholarshipCheckBox;

    @javafx.fxml.FXML
    private TextField scholarshipTextField;

    @javafx.fxml.FXML
    private ComboBox<Integer> sectionComboBox;

    @javafx.fxml.FXML
    private TextField studentidTextField;

    @javafx.fxml.FXML
    public void initalList(){
//        ComboBox
        sectionComboBox.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        courseComboBox.getItems().addAll("CSC101","CSE203","CSE201","CSE211","CSE213","CSE214","CSE216","CSE303","CSE316");
    }

    @javafx.fxml.FXML
    void addCourse(ActionEvent event) {
        System.out.println("Add all");
    }

    @javafx.fxml.FXML
    void confirmRegister(ActionEvent event) {
        System.out.println("Add all");
    }

}

