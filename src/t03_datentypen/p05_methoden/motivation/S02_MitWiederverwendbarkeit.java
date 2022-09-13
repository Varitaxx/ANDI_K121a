package t03_datentypen.p05_methoden.motivation;

public class S02_MitWiederverwendbarkeit {


  public static void main(String[] args) {
    // Überschrift in die Konsole ausgeben
    // Wiederverwendbarkeit durch Implementieren einer Methode erreicht.
    printTitle("   Eclipse   ");
    printTitle("  NetBeans   ");
    printTitle("Intellij IDEA");
  
  }
  
  public static void printTitle(String title) {
    System.out.println("=============================================================");
    System.out.println("=                       " + title + "                       =");
    System.out.println("=============================================================");
    System.out.println(".");
    System.out.println(".");
    System.out.println(".");
  }
}
