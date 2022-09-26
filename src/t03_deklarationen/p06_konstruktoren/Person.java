package t03_deklarationen.p06_konstruktoren;

public class Person /* extends Object */ {

  // Instanzvariablen (non-static)
  String vorname;  // Defaultwert null
  String nachname; // Defaultwert null
  
  // Wenn Sie keinen expliziten Konstruktor implementieren =>
  // stellt der Compiler den "Default"-Konstruktor zur Verfügung
  // public className() { }
  
  // [access modifier] className([Parameter List]) { ... }
  public Person() {
    System.out.println("=============================================");
    System.out.println("=           Person()-Konstruktor            =");
    System.out.println("=============================================");
  }
  
  public Person(String vorname, String nachname) {
    System.out.println("=============================================");
    System.out.println("=    Person(String,String)-Konstruktor      =");
    System.out.println("=============================================");
    this.vorname = vorname;
    this.nachname = nachname;
  }
  
  public void printData() {
    System.out.println("Person: " + this.vorname + " " + this.nachname);
  }
  
  
  
}

