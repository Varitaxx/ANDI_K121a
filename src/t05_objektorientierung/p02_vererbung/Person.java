package t05_objektorientierung.p02_vererbung;

public class Person /* extends Object */ {
  private String vorname;
  private String nachname;

  public Person() { } // Konstruktoren werden nicht vererbt

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

  public String getFullname() {
    return vorname + " " + nachname;
  }

  public void printInfo() {
    System.out.println(getFullname());
  }

  public static void staticMethod() {}
}
