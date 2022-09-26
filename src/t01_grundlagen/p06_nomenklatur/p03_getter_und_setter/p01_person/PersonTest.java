package t01_grundlagen.p06_nomenklatur.p03_getter_und_setter.p01_person;

public class PersonTest {
  
  public static void main( String[] args ) {
    Person p1 = new Person();
    //p1.vorname = "Peter"; // COMPILER-FEHLER,da vorname "private" ist
    p1.setVorname("Peter"); // OK
  
    System.out.println("Vorname: " + p1.getVorname());
  }
  
}
