package t02_kontrollstrukturen.p01_conditional;


import javax.swing.*;

public class S02_Switch {

  public static void main(String[] args) {
// mit switch kann man folgende Typen auf "Gleichheit" zu mehreren Werten prüfen
// Erlaubte Datentypen: byte, Byte, short, Short, int, Integer, char, Character, String, enums

    switchWithInteger();
//    switchWithString();
//    switchWithEnum();
//    switchWithChar();
    System.out.println("=== END ===");
  }

  private static void switchWithInteger() {
// byte, short, int (Byte, Short, Integer)
    int tag = 5; // 0 (Montag) bis 6 (Sonntag)
// ======================================
    switch (tag) {
      case 0:
        System.out.println("Montag");
        break; // Um Fall-Through zu vermeiden !!!
      case 1:
        System.out.println("Dienstag");
        break;
      case 2:
        System.out.println("Mittwoch");
        break;
      case 3:
        System.out.println("Donnerstag");
        break;
      case 4:
        System.out.println("Freitag");
        break;
//      default:  // auch OK (break nicht vergessen)
//        System.out.println("Unzulässiger Tag");
//        break;
      case 5:
        System.out.println("Samstag");
        break;
      case 6:
        System.out.println("Sonntag");
        break;
      default:
        System.out.println("Unzulässiger Tag");
    }
  }

  private static void switchWithString() {
    String eingabe = JOptionPane.showInputDialog("Ihre Eingabe");
    switch ( eingabe ) {
      case "1":
        JOptionPane.showMessageDialog(null, "action 1 wird gestartet ...");
        break;
      case "2":
        JOptionPane.showMessageDialog(null, "action 2 wird gestartet ...");
        break;
      case "0":
        JOptionPane.showMessageDialog(null, "action 0 wird gestartet ...");
        break;
      default:
        JOptionPane.showMessageDialog(null, "Ungültige Eingabe");
    }
  }


  enum Size { S, M, L, XL, XXL }

  private static void switchWithEnum() {
    Size size = Size.S;
    
    switch ( size ) {
      case S:
        System.out.println("Small");
        break;
      case L:
        System.out.println("Large");
        break;
      // ...
      default:
        // Fehler auslösen: switch überarbeiten
    }
  }

  private static void switchWithChar() {
//    char myChar = 65; // 'A'
    char myChar = 'B';
    switch (myChar) {
      case 'A':
        System.out.println("Anton");
        break;
      case 'B': // oder 66 ASCII Code für 'B'
        System.out.println("Berta");
        break;
      case 'C': // oder '\u0043' Unicode für 'C'
        System.out.println("Cesar");
        break;
      case '\u0644': // oder '\u0644' Unicode für 'ل'
        System.out.println("لحم");
        break;
      default:
        System.out.println("Unbekanntes Zeichen");

    }
  }


}
