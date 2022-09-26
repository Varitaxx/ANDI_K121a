package t01_grundlagen.p06_nomenklatur.p01_bezeichner;

import java.io.FileNotFoundException;

public class T01_Bezeichner { // Camel Case: DistanceMeasurment
  
  private int groesse;
  
  private int myCounter;
  
  private final int MAX_ANZAHL = 12; // Eine Konstante

//  private int void; // Fehler, void ein Schlüsselwort ist
//  private int 1abc; // Fehler, darf nicht mit einer Ziffer beginnen
//  private int abc▄; // Fehler; ▄ ist nicht erlaubt


  public void myProcessor() { }
  
  public static void main(String[] args) throws FileNotFoundException {
    String اسم = "صلاح اللجمي";
    System.out.println(اسم);
    escapeSequenzen();
  }

  private static void escapeSequenzen() {
    // Escapesequenzen
    System.out.println("Der Titel lautet \"Schöne Berge\"");
    // Der Titel lautet "Schöne Berge" --> \"
    System.out.println("vor \n nach");
    System.out.println("wort1\twort2\"'");
    char myChar = '\'';
    System.lineSeparator();
    char myChar2 = 'a';
    System.out.println(myChar);
    System.out.println("t09_IO_NIO/a" + System.lineSeparator() + "b");
    String zeichenkette = "............................";
  }

  public void تحميل(){
    
  }
}
