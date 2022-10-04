package t05_objektorientierung.aufgaben.aufgabe5C.Lösung;

public abstract class Person {

  private String vorname;
  private String nachname;

  public Person() {
  }

  public Person(String vorname, String nachname) {
    this.vorname = vorname;
    this.nachname = nachname;
  }

  public String getVorname() {
    return vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public String getNachname() {
    return nachname;
  }

  public void setNachname(String nachname) {
    this.nachname = nachname;
  }

  public void printInfo() {
    System.out.println(vorname + " " + nachname);
  }
}
