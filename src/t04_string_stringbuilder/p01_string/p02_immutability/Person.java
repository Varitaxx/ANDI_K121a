package t04_string_stringbuilder.p01_string.p02_immutability;

// Bei jeder nachträglichen Änderung von Person => ein neues Person-Objekt wird erstellt
// => Person ist IMMUTABLE
public class Person {

  final String vorname;
  final String nachname;


  public Person(String vorname, String nachname) {
    this.vorname = vorname;
    this.nachname = nachname;
  }

//  public void setzeVorname(String vorname) {
//    this.vorname = vorname;
//  }

  // Eine Manipulation (Änderung) von Person erzeugt ein neues Objekt und ändert NICHT das aktuelle Objekt
  public Person setzeVorname(String neuerVorname) {
    return new Person(neuerVorname, this.nachname);
  }

  // Eine Manipulation (Änderung) von Person erzeugt ein neues Objekt und ändert NICHT das aktuelle Objekt
  public Person setzeNachname(String neuerNachname) {
    return new Person(this.vorname, neuerNachname);
  }

  @Override
  public String toString() {
    return vorname + " " + nachname;
  }
}
