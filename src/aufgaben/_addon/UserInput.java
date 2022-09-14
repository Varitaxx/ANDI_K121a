package aufgaben._addon;

import javax.swing.*;

public class UserInput {
  
  public static void main( String[] args ) {
    String menu = "1. Person erstellen\n" +
                      "2. Personenliste anzeigen\n" +
                      "3. Person aktualisieren\n" +
                      "4. Person löschen\n" +
                      "0. Beenden\n";
    
    // Grafische Benutzereingabe: JOptionPane.showInputDialog( message );
    // Grafische Benutzerausgabe: JOptionPane.showMessageDialog( null, message );
    
    while( true ) {
      String userChoice = JOptionPane.showInputDialog(menu);
      System.out.println("userChoice: " + userChoice);
      if (userChoice.equals("0")) {
        JOptionPane.showMessageDialog(null, "Applikation wird beendet");
        System.exit(0);
      } else if (userChoice.equals("1")) {
        JOptionPane.showMessageDialog(null, "Person erstellen");
      } else if (userChoice.equals("2")) {
        JOptionPane.showMessageDialog(null, "Personenliste");
      } else if (userChoice.equals("3")) {
        JOptionPane.showMessageDialog(null, "Person aktualisieren");
      } else if (userChoice.equals("4")) {
        JOptionPane.showMessageDialog(null, "Person löschen");
      } else {
        JOptionPane.showMessageDialog(null, "Falsche Eingabe");
      }
    }
    
  }
  
}
