package aufgaben.coding.aufgabe024;

public class Book {
  
  private static int counter; // Defaultwert 0
  private static final int MAX_COUNT = 2;
  
  private Book() { }
  
  public static Book getInstance() {
    if (counter >= MAX_COUNT)
      return null;
    counter++;
    return new Book();
  }
  

}
