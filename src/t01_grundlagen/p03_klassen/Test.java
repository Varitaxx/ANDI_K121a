package t01_grundlagen.p03_klassen;


import t01_grundlagen.p03_klassen.entities.Person;
import t01_grundlagen.p03_klassen.util.DateUtil;

public class Test {
  public static void main(String[] args) {
    // von hier aus werden anderen Klassen in der Applikation angesprochen
    System.out.println("Ist heute Freitag? " + DateUtil.istHeuteFreitag());
    double result = Math.pow(4, 3);
    System.out.println(result);

    Person p1 = new Person(); // p1 ist eine Instanz (Objekt) der Klasse Person
    p1.vorname = "Peter";
    p1.nachname = "Schmidt";

    Person p2 = new Person(); // p2 ist eine Instanz (Objekt) der Klasse Person
    p2.vorname = "Hans";
    p2.nachname = "Meyer";
  }
}
