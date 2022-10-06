package t05_objektorientierung.p07_polymorphismus.p01_mit_klassen;

public class Person /* extends Object */{
  
  private String vorname;
  private String nachname;

  public Person() {
  }

  public Person(String vorname, String nachname) {
    this.vorname = vorname;
    this.nachname = nachname;
  }

  public String getFullName() {
    return vorname + " " + nachname;
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

  public void printData() {
    System.out.format("%s %s%n", vorname, nachname);
  }
  
}
