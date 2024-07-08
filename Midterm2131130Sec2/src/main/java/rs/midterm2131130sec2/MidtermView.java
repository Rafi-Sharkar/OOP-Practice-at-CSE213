package rs.midterm2131130sec2;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

import static rs.midterm2131130sec2.Book.count;

public class MidtermView
{
    @javafx.fxml.FXML
    private TableView tableTV;
    @javafx.fxml.FXML
    private TextField booktitleTF;
    @javafx.fxml.FXML
    private TableColumn<Book, String> booktitleTV;
    @javafx.fxml.FXML
    private TextField bookidTF;
    @javafx.fxml.FXML
    private TextField priceTF;
    @javafx.fxml.FXML
    private ComboBox<String> generoneCB;
    @javafx.fxml.FXML
    private TableColumn<Book, Integer> bookidTV;
    @javafx.fxml.FXML
    private TableColumn<Book, Double> priceTV;
    @javafx.fxml.FXML
    private TableColumn<Book, String> generTV;
    @javafx.fxml.FXML
    private TableColumn tatalbooksTV;
    @javafx.fxml.FXML
    private ComboBox<String> genertwoCB;
    @javafx.fxml.FXML
    private TextField maxpriceTF;
    @javafx.fxml.FXML
    private TextField minpriceTF;

    private ArrayList<Book> set = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        generoneCB.getItems().addAll("A", "B", "C","D","E","F");
        genertwoCB.getItems().addAll("A", "B", "C","D","E","F");

        bookidTV.setCellValueFactory(new PropertyValueFactory<Book, Integer>("bookId"));
        booktitleTV.setCellValueFactory(new PropertyValueFactory<Book, String>("bookTitle"));
        generTV.setCellValueFactory(new PropertyValueFactory<Book, String>("bookGener"));
        priceTV.setCellValueFactory(new PropertyValueFactory<Book, Double>("price"));
    }

    /*
            int bookid = Integer.valueOf(bookidTF.getText());
           String booktitle = booktitleTF.getText();
           String gener = generoneCB.getValue();
           double price = Double.valueOf(priceTF.getText());
     */
    @javafx.fxml.FXML
    public void SearchAndShow(ActionEvent actionEvent) {
        int bookid = Integer.valueOf(bookidTF.getText());
        String booktitle = booktitleTF.getText();
        String gener = generoneCB.getValue();
        double price = Double.valueOf(priceTF.getText());

        for (Book bk: set){
            if ( bookid == bk.getBookId() && booktitle == bk.getBookTitle() && gener == bk.getBookGener() && price == bk.getPrice()){
                tableTV.getItems().add(bk);
            }else {
                showAlert("not exist", "check for other");
            }
        }
    }

    private boolean checkDuplicat(int id){
        boolean D = true;
        for ( Book b: set){
            if (b.getBookId() == id){
                D = true;
            }else {
                D = false;
            }
        }
    }



    @javafx.fxml.FXML
    public void addtoArrayList(ActionEvent actionEvent) {
       if ((Integer.valueOf(priceTF.getText())<=0) ){
           showAlert("Invalid price","Enter valid price");
       } else if (checkDuplicat(Integer.valueOf(priceTF.getText())) == true) {
           showAlert("Duplicate book id","Enter valid bookid");
       }else {
           int bookid = Integer.valueOf(bookidTF.getText());
           String booktitle = booktitleTF.getText();
           String gener = generoneCB.getValue();
           double price = Double.valueOf(priceTF.getText());

           Book b = new Book(bookid, booktitle, gener,price);

           set.add(b);
           count++;
       }
    }

    private void showAlert(String title, String dis){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(dis);
        alert.showAndWait();
    }
}