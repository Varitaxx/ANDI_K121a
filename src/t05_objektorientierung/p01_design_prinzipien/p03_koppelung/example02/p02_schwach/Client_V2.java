package t05_objektorientierung.p01_design_prinzipien.p03_koppelung.example02.p02_schwach;

public class Client_V2 {

  // Bei Wechsel zu DatabaseBookService => 1x Änderung in BookService
  public void client1() {
    BookService bookService = BookService.getInstance();
  }

  public void client2() {
    BookService bookService = BookService.getInstance();
  }

  public void client3() {
    BookService bookService = BookService.getInstance();
  }

}
