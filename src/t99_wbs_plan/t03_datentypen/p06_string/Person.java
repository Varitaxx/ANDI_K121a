package t99_wbs_plan.t03_datentypen.p06_string;

// Alle Klassen in Java sind (direkt oder indirekt) Unterklassen der Klasse "Object"
public class Person /* extends Object */ {

  private String vorname;
  private String nachname;


  public Person( String vorname, String nachname) {
    this.vorname = vorname;
    this.nachname = nachname;
  }
  
  public String getVorname() {
    return vorname;
  }
  
  public void setVorname( String vorname ) {
    this.vorname = vorname;
  }
  
  public String getNachname() {
    return nachname;
  }
  
  public void setNachname( String nachname ) {
    this.nachname = nachname;
  }
  
  @Override // Informative Darstellung des aktuellen Objektes
  public String toString() {
    return vorname + " " + nachname;
  }
}
