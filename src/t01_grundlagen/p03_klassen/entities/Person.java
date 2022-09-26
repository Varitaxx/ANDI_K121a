package t01_grundlagen.p03_klassen.entities;
// Entity Class (Daten-Container)
public class Person {
  // Variablen (Attribute)
  public String vorname;
  public String nachname;

  // Konstruktoren
  public Person() { }

  public Person(String vorname, String nachname) {
    this.vorname = vorname;
    this.nachname = nachname;
  }

  // Methoden
  // Getter-Methode
  public String getVorname() {
    return vorname;
  }

  // Setter-Methode
  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  // hashCode(), equals(), toString()

}
