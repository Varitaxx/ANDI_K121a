package aufgaben.aufgabe026;

public class Kreditkarte {
  
  public static void main( String[] args ) {
    //                           <==================
    // 1234-4567-9014-8785 =>    1234-XXXX-XXXX-XXXX
    String kreditkartennummer = "1234-4567-9014-8785";
    String maskiert = maskieren(kreditkartennummer);
  
    System.out.println("kreditkartennummer: " + kreditkartennummer);
    System.out.println("maskiert          : " + maskiert);
  }
  
  public static String maskieren(String nummer) {
    String output = "";
    int counter = 0;
    // von rechts nach links
    for( int i = nummer.length() -1  ; i >= 0  ; i-- ) {
      String currentChar = nummer.charAt(i) + ""; //
      // Wenn das aktuelle Zeichen eine Ziffer ist UND noch nicht 12 Ziffern ersetzt
      if ( currentChar.matches("[0-9]") && counter < 12 ) {
        output = "X" + output; // Ziffer mit "X" ersetzen
        counter++; // counter = counter + 1
      } else { // Keine Ziffer oder bereits 12 Ziffern ersetzt
        output = currentChar + output; // Das Zeichen 1:1 übernehmen
      }
    }
    return output;
  }
  
}
