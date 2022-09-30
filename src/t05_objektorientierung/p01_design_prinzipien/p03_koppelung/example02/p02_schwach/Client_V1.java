package t05_objektorientierung.p01_design_prinzipien.p03_koppelung.example02.p02_schwach;

public class Client_V1 {

  // Bei Wechsel zu DatabaseBookService => 3 Änderungen
  public void client1() {
//    BookService bookService = new FileBookService();
    BookService bookService = new DatabaseBookService();
    // Operationen mit bookService

  }

  public void client2() {
//    BookService bookService = new FileBookService();
    BookService bookService = new DatabaseBookService();
  }

  public void client3() {
//    BookService bookService = new FileBookService();
    BookService bookService = new DatabaseBookService();
  }

}
