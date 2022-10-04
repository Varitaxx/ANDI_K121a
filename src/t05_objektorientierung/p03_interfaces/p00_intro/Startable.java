package t05_objektorientierung.p03_interfaces.p00_intro;

public /* abstract */  interface Startable { // abstract => new Startable(); NICHT erlaubt

  // Alle Variablen sind implizit "public static final" => Konstanten
  /* public static final */ int MAX_SPEED = 1200;

  // Alle Methoden (außer default und static) sind implizit "public abstract"
  /* public abstract */ void start();

  // Weitere erlaubte Methoden in der Interface: default / static, alle implizit public
  /* public */ default void defaultMethod() { /* mit Rumpf */ }
  /* public */ static  void staticMethod()  { /* mit Rumpf */ }

  // Innere Typdeklarationen (implizit public static)
  class InnerClass {}
  interface InnerInterface {}
  enum InnerEnum {}
  @interface InnerAnnotation {}
}
