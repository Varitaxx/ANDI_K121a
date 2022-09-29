package t03_deklarationen.p12_modifier.nonaccess.p02_final.p02_methods;

public class Person {
  // Methode ist final: sie kann in der Unterklasse
  // - NICHT überschrieben/verdeckt werden

  public final static void staticMethod() { }

  public final        void instanceMethod() {
    System.out.println("Person.instanceMethod()");
  }

}


class Mitarbeiter extends Person { // Unterklasse von Person

  //public static void staticMethod() { } // FEHLER, da Super-Methode final ist

//  @Override
//  public void instanceMethod() { // FEHLER, da Super-Methode final ist
//    System.out.println("Mitarbeiter.instanceMethod()");
//  }

}