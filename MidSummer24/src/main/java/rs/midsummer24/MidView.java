package rs.midsummer24;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

import static rs.midsummer24.Book.totalcount;

public class MidView
{
    @javafx.fxml.FXML
    private TableView tableTV;
    @javafx.fxml.FXML
    private TextField booktitleTF;
    @javafx.fxml.FXML
    private TextField priceTF;
    @javafx.fxml.FXML
    private TableColumn<Book, Integer> bookidTV;
    @javafx.fxml.FXML
    private TextField maxpriceTF;
    @javafx.fxml.FXML
    private TableColumn<Book, String> booktitleTV;
    @javafx.fxml.FXML
    private TextField bookidTF;
    @javafx.fxml.FXML
    private TableColumn<Book, Double> priceTV;
    @javafx.fxml.FXML
    private ComboBox<String> bookgenreCB;
    @javafx.fxml.FXML
    private TextField minpriceTF;
    @javafx.fxml.FXML
    private TableColumn<Book, Integer> totalcountTV;
    @javafx.fxml.FXML
    private TableColumn<Book, String> genreTV;
    @javafx.fxml.FXML
    private ComboBox<String> selectgenreCB;

    private ArrayList<Book> set = new ArrayList<Book>();

    @javafx.fxml.FXML
    public void initialize() {
        bookgenreCB.getItems().addAll("A","B","C","D","E");
        selectgenreCB.getItems().addAll("A","B","C","D","E");

        bookidTV.setCellValueFactory(new PropertyValueFactory<Book, Integer>("bookid"));
        booktitleTV.setCellValueFactory(new PropertyValueFactory<Book, String>("booktitle"));
        genreTV.setCellValueFactory(new PropertyValueFactory<Book, String>("bookgenre"));
        priceTV.setCellValueFactory(new PropertyValueFactory<Book, Double>("price"));
        totalcountTV.setCellValueFactory(new PropertyValueFactory<Book, Integer>("totalcount"));


    }

    /*
        int bookid = Integer.valueOf(bookidTF.getText());
        String booktitle = booktitleTF.getText();
        String bookgenre = bookgenreCB.getValue();
        double price = Integer.valueOf(priceTF.getText());
     */

    private boolean isDuplicate(int id ){
        boolean D = false;
        for (Book b: set){
            if (b.getBookid() == id){
                D = true;
                break;
            }else {
                continue;
            }
        }
        return D;
    }

    @javafx.fxml.FXML
    public void searchAndShow(ActionEvent actionEvent) {
       String sg = selectgenreCB.getValue();
       double minp = Double.valueOf(minpriceTF.getText());
       double maxp = Double.valueOf(maxpriceTF.getText());
        ArrayList<Book>  selectedbk = new ArrayList<Book>( );

       for ( Book bk: set){
           if (
                   bk.getBookgenre().equals(sg) && bk.getPrice()>=minp && bk.getPrice()<= maxp
           ){
               selectedbk.add(bk);
           }else {
               continue;
           }
       }

       if (selectedbk.isEmpty()){
           showAlert("Book is not available", "Search for another book");
       }else {
           tableTV.getItems().addAll(selectedbk);
       }

    }

    private void showAlert(String title, String dis){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(dis);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void addtoArrayList(ActionEvent actionEvent) {
        if ( Integer.valueOf(priceTF.getText()) <= 0 ||
                isDuplicate(Integer.valueOf(bookidTF.getText()))
        ){
            showAlert("Input is not valid", "Enter valid input");
        }else {
            int bookid = Integer.valueOf(bookidTF.getText());
            String booktitle = booktitleTF.getText();
            String bookgenre = bookgenreCB.getValue();
            double price = Double.valueOf(priceTF.getText());

            Book bk = new Book(bookid, booktitle, bookgenre, price,++totalcount);
            set.add(bk);
        }
    }
}