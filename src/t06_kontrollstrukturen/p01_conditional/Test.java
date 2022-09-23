package t06_kontrollstrukturen.p01_conditional;

import java.time.LocalDate;
import java.util.Arrays;

public class Test {
  
  public static void main( String[] args ) {
    //schleifen();
    breakContinue();
  }
  
  private static void schleifen() {
    //
    String[] nameArray = { "Peter", "Hans", "Thomas", "Stefan" };
    //String[] nameArray = {  };
    
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
    System.out.println("============================================================");
    int i = 0;
    while ( i < nameArray.length ) {
      System.out.println( "✔  " + nameArray[i] ); // ALT + code (NumPad)
      i++;
    }
    System.out.println("============================================================");
    i = 0;
    do {
      System.out.println( "→  " + nameArray[i] ); // LAUFZEIT-FEHLER, wenn das Array leer ist.
      i++;
    } while (i < nameArray.length);
    System.out.println("============================================================");
  }
  
  public static void breakContinue( ) {
    String[] nameArray = { "Peter", "Hans", "Thomas", "Stefan" };
    
    for( String name : nameArray ) {
      if (name.length() <= 4) {   // name.equals("Peter");
        continue;
      }
      System.out.println(name);
    }
  
  }
  
  
}
