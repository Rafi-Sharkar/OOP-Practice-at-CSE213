package rs.midterm2131130sec2;
// MidTermController.java

public class Book {
    public static  int count;
    private int  bookId;
    private  String bookTitle;
    private String bookGener;
    private double price;

    public Book(int bookId, String bookTitle, String bookGener, double price) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookGener = bookGener;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookGener() {
        return bookGener;
    }

    public void setBookGener(String bookGener) {
        this.bookGener = bookGener;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookGener='" + bookGener + '\'' +
                ", price=" + price +
                '}';
    }
    private int getNoBook(){
        return count;
    }
}
