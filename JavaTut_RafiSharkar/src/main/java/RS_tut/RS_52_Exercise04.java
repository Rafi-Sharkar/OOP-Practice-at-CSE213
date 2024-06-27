//package RS_tut;
//
//static class Library{
//    static String[] bookList;
//    Library(){
//        this.bookList = new String[100];
//    }
//    void addBook(String book){
//        for (int i=0; i<this.bookList.length; i++){
//            if (this.bookList[i] == null){
//                this.bookList[i] = book;
//                System.out.println(book +" has been added!");
//                break;
//                }
//            }
//        System.out.println("There have no space for add a new book. Sorry :-( ");
//        }
//    }
//    void showAvailableBooks(){
//        System.out.println("Available Books are: ");
//        for(String book: ){
//            if (book == null){
//                continue;
//            }
//            System.out.println("* "+book);
//        }
//    }
//    void issueBook(String issu_book){
//        for (int i=0; i<this.books.length; i++ ){
//            if (this.books[i].equals(issu_book)){
//                System.out.println(issu_book+ "book has been issued !!");
//                this.books[i] = null;
//                return;
//            }
//            System.out.println("This book does not exist ");
//        }
//    }
//    void returnBook(String book){
//        addBook(book);
//    }
//}
//
//public class RS_52_Exercise04 {
//    public static void main(String[] args){
////        --> You have to implement a library using Java Class "Library"
////        --> Methods: addBook, issueBook, returnBook, showAvailableBooks
////        --> Properties: Array to store the available books
////        --> Array to store the issued boos
//
//         Library centralLibrary = new Library();
//         centralLibrary.addBook("Data Structures ");
//         centralLibrary.addBook("Algorithms");
//         centralLibrary.addBook("Networking");
////         centralLibrary.showAvailableBooks();
////         centralLibrary.issueBook("Algorithms");
////         centralLibrary.showAvailableBooks();
//
//    }
//}
