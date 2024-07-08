package rs.midsummer24;

public class Book {
    public static int totalcount;
    private int bookid ;
    private String booktitle;
    private  String bookgenre;
    private  double price;

    public Book(int bookid, String booktitle, String bookgenre, double price, int tc) {
        this.bookid = bookid;
        this.booktitle = booktitle;
        this.bookgenre = bookgenre;
        this.price = price;
        this.totalcount = tc;
    }

    public static int getTotalcount() {
        return totalcount;
    }

    public static void setTotalcount(int totalcount) {
        Book.totalcount = totalcount;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getBookgenre() {
        return bookgenre;
    }

    public void setBookgenre(String bookgenre) {
        this.bookgenre = bookgenre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalCount(){
        return totalcount;
    }
}
