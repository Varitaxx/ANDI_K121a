package t05_objektorientierung.p05_ueberschreiben.p01_test;

// ==========================================================
public class ÜberschreibenTest {
  public static void main(String[] args) {

  }
}

// ==========================================================
// Überschreiben gilt für Instanzmethoden NUR!!!
class MyClass {
  // Überschriebene Methode
  public void doSomething(String input) {
    // ...
  }
}

// ==========================================================
class MySubClass extends MyClass {

  @Override // Überschreibende Methode (Gleiche Signatur wie die Supermethode)
  public void doSomething(String param) {

  }
}
// ==========================================================
// ==========================================================
// ==========================================================
interface Startable {
  // Abstrakte Methoden der Interface sind Instanzmethoden
  /* public abstract */ void start();
}

// ==========================================================
class PC implements Startable {

  // Eine konkrete Unterklasse muss alle abstrakten Methoden
  // von allen Supertypen überschreiben (realisieren/implementieren)
  @Override
  public void start() {
    System.out.println("PC wird gestartet");
  }
}
// ==========================================================
