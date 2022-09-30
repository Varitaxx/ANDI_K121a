package t05_objektorientierung.p01_design_prinzipien.p03_koppelung.example02.p02_schwach;

public abstract class BookService {

  public static BookService getInstance() {
    BookService bookService = new FileBookService();   // Polymorphismus
    //BookService bookService = new DatabaseBookService(); // Polymorphismus
    return bookService;
  }
}
