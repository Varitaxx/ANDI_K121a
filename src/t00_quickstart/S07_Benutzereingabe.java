package t00_quickstart;

import javax.swing.*;
import java.util.Scanner;

public class S07_Benutzereingabe {

  public static void main(String[] args) {
    System.out.println("################################################");
    eingabeMitScanner();
//    eingabeMitJOptionPane();
    System.out.println("################################################");
  }

  private static void eingabeMitScanner() {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Geben Sie Ihren Namen ein: ");
    String name = myScanner.next();
    System.out.println("Ihr Name ist: " + name);

    System.out.print("Geben Sie Ihr Alter ein: ");
    int alter = myScanner.nextInt(); // nextDouble()
    System.out.println("Sie sind " + alter + " Jahre alt.");
    myScanner.close();
  }

  private static void eingabeMitJOptionPane() {
    String name = JOptionPane.showInputDialog("Geben Sie Ihren Namen ein: ");
    String ausgabe = "Ihr Name ist: " + name;
    JOptionPane.showMessageDialog(null, ausgabe);

    String zahlAsString = JOptionPane.showInputDialog("Geben Sie eine Zahl ein: ");
    int zahl = Integer.parseInt(zahlAsString);
    ausgabe = "Ihre Zahl zum Quadrat: " + (zahl * zahl);
    JOptionPane.showMessageDialog(null, ausgabe);
  }
}
