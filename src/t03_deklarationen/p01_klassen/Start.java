package t03_deklarationen.p01_klassen;

// Start-Klasse mit der main()-Methoden
public class Start {

  public static void main(String[] args) {


    // Anwendung einer Entity-Klasse
    Person person = new Person();
    person.vorname = "Peter";

    // Anwendung einer Utility-Klasse
    System.out.println("Die Zahl 23 ist eine Primzahl: " + NumberUtil.istPrimzahl(23));
    System.out.println("Die Zahl 40 ist eine Primzahl: " + NumberUtil.istPrimzahl(40));
    System.out.println("Math.cos(32): " + Math.cos(32));
    // System ist auch eine Utility-Klasse: System.out


  }
}
