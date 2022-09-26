package t03_deklarationen.p04_variablen;


public class T01_VariablenDeklaration {
  // Nicht-Lokale (Top-Level) Variablen
  // [access modifier] [non-access modifier]* <type> <variable name> [= expression];
  // ==================================================================
  // Deklaration ohne expliziten Initialwert => Impliziter Defaultwert
  // ==================================================================
  public int counter; // Defaultwert = 0;
//  protected transient volatile String comment; // Defaultwert = null;
  transient protected volatile String comment;   // Defaultwert = null;
  // ==================================================================
  // Deklaration mit expliziten Initialwert
  // ==================================================================
  static public final int MWST = 19; // Konstante (wegen "final")

  public void deklarationsMöglichkeiten() {
    int a;
//    int b = a + 1; // unzulässig, da die lokale Variable a nicht initialisiert wurde!
    int b = 12;
    a = 10;
    int c = 12 + a + b;
    int d = getRandomValue();
    // ===========================
    int i,j,k;
    i = 10;
    i = 12;
    int h = 10, g;
    Person p1 = new Person(), p2, p3 = null;
  }

  private int getRandomValue() {
    // ....
    return 0;
  }

  public void instanzMethode() {
   // Kann alle Instanz- und Klassenelemente (Variablen und Methoden) ansprechen
    System.out.println("this.comment: " + this.comment); // oder einfach "comment"
    System.out.println("this.counter: " + this.counter); // oder einfach "counter"
    System.out.println("MWST: " + MWST); // OK: Klassenvariable
    klassenMethode(); // OK: Klassenmethode
  }

  public static void klassenMethode() {
    // Kann NUR alle Klassenelemente (Variablen und Methoden) ansprechen
    // System.out.println("this.comment: " + this.comment); // FEHLER: "this" ist hier (static context) NICHT erlaubt
    // this.instanzMethode(); // FEHLER:  "this" ist hier (static context) NICHT erlaubt
    // instanzMethode();      // <=> this.instanzMethode() => FEHLER aus dem gleichen Grund
    System.out.println("MWST: " + MWST); // OK: Klassenvariable
  }


  public static void main(String[] args) {
    // ==========================================================================
    // Nicht-Lokale Variablen (Intanz- und Klassenvariablen)
    // ==========================================================================
    // Instanzvariablen (non-static)
    T01_VariablenDeklaration instance = new T01_VariablenDeklaration();
    System.out.println("instance.counter: " + instance.counter);
    System.out.println("instance.comment: " + instance.comment);
    // Klassenvariablen (static)
    System.out.println("VariablenDeklaration.MWST: " + T01_VariablenDeklaration.MWST);
    // ==========================================================================
    // Lokale Variablen: Sichtbar nur innerhalb des Anweisungsblocks, in dem sie deklariert sind
    // ==========================================================================
    // [final] <type> <variable name> [= expression];
    int localVar ; // Lokale Variable: NUR innerhalb der main()-Methode sichtbar
//    System.out.println(localVar); // COMPILER-FEHLER: "Variable 'localVar' might not have been initialized"
    int localCounter = 12;
    System.out.println("localCounter: " + localCounter);
    localVar = 20;
  } // end of main()

}

class Person{}
