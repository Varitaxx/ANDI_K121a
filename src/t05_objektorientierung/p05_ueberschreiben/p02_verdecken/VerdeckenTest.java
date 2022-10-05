package t05_objektorientierung.p05_ueberschreiben.p02_verdecken;

// ==========================================================
public class VerdeckenTest { }
// ==========================================================

class MyClass {
         int instVar;
  static int staticVar;

         void instMethod() { }
  static void staticMethod() { }

}
// ==========================================================

class MySubClass extends MyClass {
  // Variablen (Instanz- und Klassenvariablen) und statische Methoden der Unterklasse
  // verdecken die gleichnamigen Elemente der Superklasse
         int instVar;            // Verdecken
  static int staticVar;          // Verdecken

         void instMethod() { }   // ÜBERSCHREIBEN / OVERRIDE !!!
  static void staticMethod() { } // Verdecken
}
// ==========================================================
