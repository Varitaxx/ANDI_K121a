package t06_kontrollstrukturen.p01_conditional;

import java.time.LocalDate;
import java.util.Arrays;

public class Test {
  
  public static void main( String[] args ) {
    //
    String[] nameArray = { "Peter", "Hans", "Thomas", "Stefan" };

    // Iterationsvariable Array / Iterable
    for ( String name : nameArray ) {
      System.out.println("* " + name);
    }
    System.out.println("============================================================");
    // Indizes eines Arrays: 0 .. (Länge - 1)
    for (int i = 0; i < nameArray.length; i++) {
      System.out.println("- " + nameArray[i] );
    }
    System.out.println("============================================================");
    // Jeden zweiten Namen ausgeben:
    for (int i = 0; i < nameArray.length; i = i + 2) {
      System.out.println("+ " + nameArray[i] );
    }
    System.out.println("============================================================");
    // Alle Namen rückwärts ausgeben
    for (int i = nameArray.length - 1; i >= 0 ; i--) {
      System.out.println("# " + nameArray[i] );
    }
    
    
  }
  
  
}
