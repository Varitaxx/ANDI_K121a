package t06_kontrollstrukturen.p02_loops;

import javax.swing.*;

public class T03_DoWhile {
  public static void main(String[] args) {
    basisTest();
//    arrayTest();
//    endlosSchleife();
    System.out.println("=== END ===");
  }

  private static void basisTest() {
    String choice;
    do {
      choice = JOptionPane.showInputDialog("Ihre Auswahl bitte (0 für Beenden)");
    } while (!choice.equals("0"));
  }

  private static void arrayTest() {
    int[] zahlen = {2, 4, 7, 9}; //
    int i = 0;
    do {
      System.out.println(zahlen[i]); // ACHTUNG: Laufzeitfehler möglich, wenn Array leer ist
      i++;
    } while (i < zahlen.length);
  }

  private static void endlosSchleife() {
    do {
      System.out.println(".");
    } while (true);
  }
}
