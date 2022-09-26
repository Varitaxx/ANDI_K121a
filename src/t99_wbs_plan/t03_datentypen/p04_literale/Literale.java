package t99_wbs_plan.t03_datentypen.p04_literale;

public class Literale {
  
  public static void main( String[] args ) {
    
    System.out.println(Integer.MAX_VALUE); // 2147483647
    int zahl = 12; // 12 ist ein int-Literal
    
    byte b1 = 127; // -128..127
    short s1 = 32767; //-32768..32767
    int a = 2_000_000_000;  // auch
    //       9999999999 > Integer.MAX_VALUE (2147483647)
    long b = 9999999999L; // 9999999999L ist ein long-Literal:
    
    System.out.println("#######################################");
    long c = a * b; // (int * long)
    System.out.println(c); // long ist ok, aber das Ergebnis wird hier abgeschnitten
    
    System.out.println(b1 + s1); // b1 + s1 ist vom Typ "int"
    System.out.println(999999999 * 999999999);
    
    float f1 = 2.3f;  // 2.3f ist float-Literal
    double d1 = 2.3; // 2.3 ist ein double-Literal
    double d2 = 0.45e-3; // 0.45 * 10hoch-3 = 0.00045
    System.out.format("%.2f%n", d2); // %.2f => Fließkommazahl mit 2 Stellen nach dem Komma
    
    System.out.println("#######################################");
    double result = a / s1 * 1.0; // der Ausdruck ist vom Typ double
    System.out.println(result);
    System.out.println("#######################################");
    
    char c1 = 'A';
    char c2 = '#';
    char c3 = 64; // ASCII-Code: 0.. 255   (ASCII-Code 64 = @)
    char c4 = '\u0642'; // Unicode: 0..65535 (im Hexadezimal System)
    System.out.println(c4);
    System.out.println("#######################################");
    boolean bedingung1 = false;
    boolean bedingung2 = true;
    System.out.println("#######################################");
    // Referenztypen:
    String name1 = new String("Schmidt");
    String name2 = "Schmidt";
    String name3 = null;
    System.out.println(name3);
    // System.out.println(name3.length()); // FEHLER ===> NullPointerException
    System.out.println("#######################################");
    Person person1 = null;
    System.out.println(person1);
    // int abc = null; // FEHLER, null NUR für Referenztypen zulässig
  }
  
}

class Person { }
