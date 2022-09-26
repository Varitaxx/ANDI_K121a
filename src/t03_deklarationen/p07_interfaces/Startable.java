package t03_deklarationen.p07_interfaces;

// [access modifier] [non-access modifier] interface <name> { }
public /* abstract */ interface Startable {
  // Innere Typdeklarationen erlaubt
  // Konstruktoren NICHT erlaubt

  // Alle Variablen sind implizit: public static final  !!!
  /* public static final */ int STEP_LEN = 12;

  // Alle Methoden sind implizit: public abstract
  // (ausgenommen Methoden mit default und static ab Java 8)
  /* public abstract */ void start();
}
