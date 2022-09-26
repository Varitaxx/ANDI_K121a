package t01_grundlagen.p07_modifier;

// Aktuelle Quelldatei: AccessModifierFirstDemo.java
// ==================================================
// Nicht-innere Typdeklarationen: NUR public und <default>
public class AccessModifierFirstDemo {
  
  // Variablen: public, protected, <default>, private
  public static  int zahl;

  // Konstruktor: public, protected, <default>, private
  public AccessModifierFirstDemo() { }

  // Methoden: Access Modifier: public, protected, <default>, private
  protected void myMethod() { }

  // Innere Typdeklarationen: public, protected, <default>, private
  class InnerClass { }
}
// ###########################################
// Nicht-innere Typdeklarationen: NUR <default> (da Klassenname <> Name der Quelldatei)
/* <default> */ class ABC {

}
// ###########################################
