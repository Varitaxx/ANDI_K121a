package t05_objektorientierung.p05_ueberschreiben.p05_super_aufrufe;

public class SuperTest {
  public static void main(String[] args) {
    Mitarbeiter ma = new Mitarbeiter();
    ma.vorname = "Peter";
    ma.nachname = "Schmidt";
    ma.maNummer = 123;
    ma.printInfo();
  }
}
// ==========================================================
class Person {
  String vorname, nachname;
  long id;
  public void printInfo() {
    System.out.println(vorname + " " + nachname);
  }
}
// ==========================================================
class Mitarbeiter extends Person {
  int maNummer;
  
  public void test() {
    // Vorher
    //this.printInfo();
    //super.printInfo();
    // nachher
  }
  
  @Override
  public void printInfo() {
    System.out.println("=== Mitarbeiter.printInfo() ===");
    //System.out.println(vorname + " " + nachname);
    super.printInfo();
    System.out.println("Mitarbeiternummer: " + maNummer);
    System.out.println("===============================");
  }
}
// ==========================================================
