package t03_deklarationen.aufgaben.aufgabe3B;

public class BookServiceTestV1 {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
    usecase1();
    usecase2();
    usecase3();
    System.out.println("======================= end of main() ======================");
  }

  // Neue Anforderung: Speichern in Datenbank statt Datei => Lösung in Version 2
  private static void usecase1() {
    //FileBookService bookService = new FileBookService();
    DatabaseBookService bookService = new DatabaseBookService();
    //bookService.getList(); // ..
  }

  private static void usecase2() {
    //FileBookService bookService = new FileBookService();
    DatabaseBookService bookService = new DatabaseBookService();
    // ..
  }

  private static void usecase3() {
    //FileBookService bookService = new FileBookService();
    DatabaseBookService bookService = new DatabaseBookService();
    // ..
  }
  
}
