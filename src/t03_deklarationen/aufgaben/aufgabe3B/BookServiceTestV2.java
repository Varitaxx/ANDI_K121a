package t03_deklarationen.aufgaben.aufgabe3B;

public class BookServiceTestV2 {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    usecase1();
    usecase2();
    usecase3();
    System.out.println("======================= end of main() ======================");
  }

  // Neue Anforderung: Speichern in Datenbank statt Datei => Lösung in Version 2
  private static void usecase1() {
    BookService bookService = getBookService();
    bookService.save(null);
  }

  private static void usecase2() {
    BookService bookService = getBookService();
    bookService.delete(10L);
  }

  private static void usecase3() {
    BookService bookService = getBookService();
    bookService.update(null);
  }
  
  public static BookService getBookService() {
    //return new FileBookService();
    return new DatabaseBookService();
  }
  
}
