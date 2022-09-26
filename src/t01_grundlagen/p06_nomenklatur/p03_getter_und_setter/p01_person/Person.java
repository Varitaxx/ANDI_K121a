package t01_grundlagen.p06_nomenklatur.p03_getter_und_setter.p01_person;

public class Person {
  /*public*/ private String vorname;
  /*public*/ private String nachname;
  
  // Die Existenz von Getter- und/oder Setter-Methode => Person ist ein JavaBean
  // getVorname() und/oder setVorname() => JavaBean Property namens "vorname"
  
  // Getter-Methode für Vorname
  public String getVorname() {
    return vorname;
  }
  
  // Setter-Methode für Vorname
  public void setVorname( String vorname ) {
    this.vorname = vorname;
  }
  // Getter/Setter -Methode für nachname
  
}
