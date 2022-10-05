package t05_objektorientierung.p06_abstract_final.p02_final.p03_mit_methoden;

public class Person {
  public final static void staticMethod() { /* … */ }
  public final void instanceMethod() { /* … */ }
}


class Mitarbeiter extends Person { // Unterklasse von Person

  // FEHLER, da Methode mit gleicher Signatur in der Superklasse final ist
  // public static void staticMethod() { /* … */ }

  // @Override // FEHLER, da Super-Methode final ist
  // public void instanceMethod() { /* … */ }

}
