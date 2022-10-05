package t05_objektorientierung.p06_abstract_final.p02_final.p02_mit_variablen;

public class Person {
  // =========================================================
  // Variablen, die mit "final" deklariert sind, werden zu Konstanten
  // => Müssen genau EINMAL explizit initialisiert werden (Kein Defaultwert)

  // =========================================================
  // =============== Statische Konstanten ====================
  // =========================================================
  //  final static int COUNTER = 33; // 1. Möglichkeit zu initialisieren

  final static int COUNTER;

  static {
    COUNTER = 33;           // 2. Möglichkeit: Statischer Initialisierungsblock
  }

  // =========================================================
  // =============== Instanz-Konstanten ======================
  // =========================================================
  //  final int ZAHL = 12;   // 1. Möglichkeit zu initialisieren

  final int ZAHL;

  {
    //  ZAHL = 12;           // 2. Möglichkeit: Instanz-Inialisierungsblock
  }

  public Person() {
    ZAHL = 12;               // 3. Möglichkeit: bei allen Konstruktoren
  }                          //    siehe Person(String)-Konstruktor

  public Person(String str) {
    ZAHL = 12;
  }
  // =========================================================

}
