package t01_grundlagen.p12_instanceof;

public class InstanceOfTest {
  public static void main(String[] args) {
//    Person var = new Person();
Person var = new Mitarbeiter(); // Zulässig: Polymorphismus

if (var instanceof Object)
  System.out.println("Das Objekt, worauf var referenziert, ist vom Typ Object"); // true

if (var instanceof Person)
  System.out.println("Das Objekt, worauf var referenziert, ist vom Typ Person"); // true

if (var instanceof Mitarbeiter)
  System.out.println("Das Objekt, worauf var referenziert, ist vom Typ Mitarbeiter"); // true (bei new Person() => false)

System.out.println("var instanceof Object     : " + (var instanceof Object));
System.out.println("var instanceof Person     : " + (var instanceof Person));
System.out.println("var instanceof Mitarbeiter: " + (var instanceof Mitarbeiter));

// Startable st = new Startable(); // COMPILER-Fehler: Interfaces können nicht instanziiert werden
// Typ var = new Subtyp();
Startable st = new Waschmaschine(); // Waschmaschine ist ein Subtyp von Startable
//    Startable st = new PC();            // PC            ist ein Subtyp von Startable
System.out.println("st instanceof Object       : " + (st instanceof Object)); // true
System.out.println("st instanceof Waschmaschine: " + (st instanceof Waschmaschine)); // ??
  }
}


class Person /* extends Object */ { }
class Mitarbeiter extends Person { } // Mitarbeiter ist eine Unterklasse von Person

interface Startable { }
class Waschmaschine implements Startable /*, Serializable, Cloneable*/ { }
class PC implements Startable /*, Serializable, Cloneable*/ { }