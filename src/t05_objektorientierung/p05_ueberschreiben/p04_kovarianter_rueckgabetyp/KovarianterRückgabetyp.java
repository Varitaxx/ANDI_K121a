package t05_objektorientierung.p05_ueberschreiben.p04_kovarianter_rueckgabetyp;
// ==========================================================
public class KovarianterRückgabetyp { }
// ==========================================================

class MyClass {
  public Person getInstance() {
    return new Person();
  }

  public Startable getStartable() {
    return null;
  }
}
// ==========================================================
class MySubClass extends MyClass {

  @Override // Kovarianter Rückgabetyp
  public Mitarbeiter getInstance() {
    return new Mitarbeiter();
  }

  @Override // Kovarianter Rückgabetyp
  public Waschmaschine getStartable() {
    return new Waschmaschine();
  }
}
// ==========================================================
class Person {}
class Mitarbeiter extends Person { }
class Dozent extends Mitarbeiter { }
// ==========================================================
interface Startable { }
class Waschmaschine implements Startable { }