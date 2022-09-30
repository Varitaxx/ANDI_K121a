package t05_objektorientierung.p01_design_prinzipien.p03_koppelung.example02.p01_stark;

public class Client {

  // Bei Wechsel zu DatabaseBookService
  public void client1() {
    //FileBookService bookService = new FileBookService();
    DatabaseBookService bookService = new DatabaseBookService();
    // Operationen mit bookService
  }

  public void client2() {
    //FileBookService bookService = new FileBookService();
    DatabaseBookService bookService = new DatabaseBookService();
  }

  public void client3() {
    //FileBookService bookService = new FileBookService();
    DatabaseBookService bookService = new DatabaseBookService();
  }

}
