package t05_objektorientierung.p07_polymorphismus;

import t05_objektorientierung.p07_polymorphismus.p01_mit_klassen.Mitarbeiter;
import t05_objektorientierung.p07_polymorphismus.p01_mit_klassen.Person;
import t05_objektorientierung.p07_polymorphismus.p02_mit_interface.PC;
import t05_objektorientierung.p07_polymorphismus.p02_mit_interface.Startable;
import t05_objektorientierung.p07_polymorphismus.p02_mit_interface.Waschmaschine;

public class PolymorphismusTest {

  public static void main(String[] args) {
    polymorhismusMitUnterklassen();
    polymorhismusMitInterfaces();
  }

  private static void polymorhismusMitUnterklassen() {
    System.out.println("====================================");
    Person person = new Person("Peter", "Schmidt");
    person.printData();
    System.out.println("====================================");
    // Die Variable "person" referenziert ein Mitarbeiter-Objekt

    person = new Mitarbeiter("Hans", "Meyer", 3500);
    person.printData(); // In der Lauzeit wird Mitarbeiter.printData() ausgeführt
    System.out.println("====================================");
//    person.setGehalt(2000); // COMPILER-FEHLER
    Mitarbeiter ma = (Mitarbeiter) person; // Casting
    ma.setGehalt(4000);
  }

  private static void polymorhismusMitInterfaces() {
    // Interfaces: Startable, Klassen: Waschmaschine, PC
    Startable startable;
    System.out.println("====================================");
//    startable = new Startable(); // FEHLER: interfaces können NICHT instanziiert werden
    startable = new Waschmaschine();
    startable.start();  // Waschmaschine.start() wird ausgeführt
    System.out.println("====================================");
    startable = new PC();
    startable.start();  // PC.start() wird ausgeführt

    // =====================================================
    // startable.getSpeed();  // COMPILER-FEHLER
    PC pc = (PC) startable;
    System.out.println("Speed: " + pc.getSpeed() + " GHz");
    System.out.println("====================================");
  }
}
