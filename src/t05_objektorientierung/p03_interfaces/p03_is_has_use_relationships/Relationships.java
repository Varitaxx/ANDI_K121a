package t05_objektorientierung.p03_interfaces.p03_is_has_use_relationships;

public class Relationships {

}

// =============================================
class Person {}

// Mitarbeiter-Person: IS-Beziehung (extends)
// Mitarbeiter ist eine Person
class Mitarbeiter extends Person {}

// ===================
interface Startable { }

// PC-Startable: IS-Beziehung (implements)
// PC ist startfähig
class PC implements Startable { }
// =============================================
// Auto-Adresse: HAS-Beziehung (Adresse ist Instanzvariable von Auto)
class Auto {
  private Adresse adresse;
}
class Adresse {}
// =============================================
class BestellService {
  void bestellen() {
    // BestellService BENUTZT EmailService (USE-Beziehung)
    EMailService es = new EMailService();
    es.send();
  }
}

class EMailService {
  public void send() {
  }
}
// =============================================
